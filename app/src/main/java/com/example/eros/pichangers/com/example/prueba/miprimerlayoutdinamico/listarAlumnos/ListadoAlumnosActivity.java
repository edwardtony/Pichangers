package com.example.eros.pichangers.com.example.prueba.miprimerlayoutdinamico.listarAlumnos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.eros.pichangers.R;
import com.example.eros.pichangers.com.example.prueba.miprimerlayoutdinamico.Adapters.ListAdapterAlumnos;
import com.example.eros.pichangers.com.example.prueba.miprimerlayoutdinamico.Beans.Alumnos;

import java.util.List;

public class ListadoAlumnosActivity extends AppCompatActivity implements ListadoAlumnosView{

    ListadoAlumnosPresenter mPresenter;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado_alumnos);
        listView = (ListView) findViewById(R.id.listView);
        setPresenter(mPresenter);

        mPresenter.obetenerAlumnos();
    }

    @Override
    public void setPresenter(ListadoAlumnosPresenter presenter) {
        this.mPresenter = presenter;
    }

    @Override
    public void mostrarListadoEquipos(List<Alumnos> alumnos) {
        ListAdapterAlumnos listAdapterAlumnos = new ListAdapterAlumnos(this,alumnos);
        listView.setAdapter(listAdapterAlumnos);
    }
}
