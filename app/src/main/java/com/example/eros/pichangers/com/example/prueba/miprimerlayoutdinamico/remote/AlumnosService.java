package com.example.eros.pichangers.com.example.prueba.miprimerlayoutdinamico.remote;

import retrofit2.Call;

import com.example.eros.pichangers.com.example.prueba.miprimerlayoutdinamico.Beans.Alumnos;

import java.util.List;

import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by W3223 on 18/05/2016.
 */
public interface AlumnosService {
    @GET("alumnos")
    Call<List<Alumnos>> obtenerAlumnos();

    @POST("alumnos")
    Call<Alumnos> agregaAlumno(@Body Alumnos alumnos);

}
