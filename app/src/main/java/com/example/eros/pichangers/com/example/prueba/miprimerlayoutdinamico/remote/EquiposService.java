package com.example.eros.pichangers.com.example.prueba.miprimerlayoutdinamico.remote;

import com.example.eros.pichangers.com.example.prueba.miprimerlayoutdinamico.Beans.Equipos;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by W3223 on 18/05/2016.
 */
public interface EquiposService {
    @GET("equipos")
    Call<List<Equipos>> obtenerEquipos();

    @POST("equipos")
    Call<Equipos> agregarEquipos(@Body Equipos equipo);
}
