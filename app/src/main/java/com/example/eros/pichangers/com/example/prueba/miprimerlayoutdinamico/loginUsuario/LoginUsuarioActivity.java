package com.example.eros.pichangers.com.example.prueba.miprimerlayoutdinamico.loginUsuario;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.eros.pichangers.R;
import com.example.eros.pichangers.com.example.prueba.miprimerlayoutdinamico.listarEquipos.ListadoEquiposActivity;


public class LoginUsuarioActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn_acceder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_acceder = (Button) findViewById(R.id.btn_acceder);
        btn_acceder.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btn_acceder){
            Intent intent = new Intent(this, ListadoEquiposActivity.class);
            startActivity(intent);
        }
    }
}
