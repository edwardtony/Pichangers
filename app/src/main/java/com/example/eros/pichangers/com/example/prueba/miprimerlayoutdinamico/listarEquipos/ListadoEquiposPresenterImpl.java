package com.example.eros.pichangers.com.example.prueba.miprimerlayoutdinamico.listarEquipos;

import android.util.Log;

import com.example.eros.pichangers.com.example.prueba.miprimerlayoutdinamico.Beans.Equipos;
import com.example.eros.pichangers.com.example.prueba.miprimerlayoutdinamico.remote.EquiposService;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by W3223 on 18/05/2016.
 */
public class ListadoEquiposPresenterImpl implements ListadoEquiposPresenter {

    ListadoEquiposView mView;

    public ListadoEquiposPresenterImpl(ListadoEquiposView mView) {
        this.mView = mView;
    }

    @Override
    public void obetenerEquipos() {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://1-dot-pichangers-1307.appspot.com/rest/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        EquiposService service = retrofit.create(EquiposService.class);
        service.obtenerEquipos().enqueue(new Callback<List<Equipos>>() {
            @Override
            public void onResponse(Call<List<Equipos>> call, Response<List<Equipos>> response) {
                mView.mostrarListadoEquipos(response.body());
            }

            @Override
            public void onFailure(Call<List<Equipos>> call, Throwable t) {
                Log.e("Pichangers", t.getMessage());
            }
        });

    }


}
