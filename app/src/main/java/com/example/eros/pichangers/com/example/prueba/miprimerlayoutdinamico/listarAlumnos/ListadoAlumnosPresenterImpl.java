package com.example.eros.pichangers.com.example.prueba.miprimerlayoutdinamico.listarAlumnos;

import android.util.Log;

import com.example.eros.pichangers.com.example.prueba.miprimerlayoutdinamico.Beans.Alumnos;
import com.example.eros.pichangers.com.example.prueba.miprimerlayoutdinamico.listarEquipos.ListadoEquiposPresenter;
import com.example.eros.pichangers.com.example.prueba.miprimerlayoutdinamico.remote.AlumnosService;
import com.example.eros.pichangers.com.example.prueba.miprimerlayoutdinamico.remote.EquiposService;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by EROS on 21/05/2016.
 */
public class ListadoAlumnosPresenterImpl implements ListadoAlumnosPresenter{
    ListadoAlumnosView mView;

    public ListadoAlumnosPresenterImpl(ListadoAlumnosView mView) {
        this.mView = mView;
    }

    @Override
    public void obetenerAlumnos() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://1-dot-pichangers-1307.appspot.com/rest/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        AlumnosService service = retrofit.create(AlumnosService.class);
        service.obtenerAlumnos().enqueue(new Callback<List<Alumnos>>() {
            @Override
            public void onResponse(Call<List<Alumnos>> call, Response<List<Alumnos>> response) {
                mView.mostrarListadoEquipos(response.body());
            }

            @Override
            public void onFailure(Call<List<Alumnos>> call, Throwable t) {
                Log.e("Pichangers", t.getMessage());
            }
        });
    }
}
