package com.example.eros.pichangers.com.example.prueba.miprimerlayoutdinamico.listarEquipos;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;

import com.example.eros.pichangers.R;
import com.example.eros.pichangers.com.example.prueba.miprimerlayoutdinamico.Adapters.GridAdapterEquipos;
import com.example.eros.pichangers.com.example.prueba.miprimerlayoutdinamico.Beans.Equipos;

import java.util.List;

public class ListadoEquiposActivity extends AppCompatActivity implements ListadoEquiposView{

    private ListadoEquiposPresenter mPresenter;
    private GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado_equipos);
        gridView = (GridView) findViewById(R.id.grid);
        setPresenter(new ListadoEquiposPresenterImpl(this));

        mPresenter.obetenerEquipos();
    }

    @Override
    public void setPresenter(ListadoEquiposPresenter presenter) {
        this.mPresenter = presenter;
    }

    @Override
    public void mostrarListadoEquipos(List<Equipos> equipos) {
        GridAdapterEquipos adapter = new GridAdapterEquipos(this, equipos);
        gridView.setAdapter(adapter);
    }
}
