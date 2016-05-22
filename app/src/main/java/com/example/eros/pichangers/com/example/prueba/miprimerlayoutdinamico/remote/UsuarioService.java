package com.example.eros.pichangers.com.example.prueba.miprimerlayoutdinamico.remote;

import com.example.eros.pichangers.com.example.prueba.miprimerlayoutdinamico.Beans.Equipos;
import com.example.eros.pichangers.com.example.prueba.miprimerlayoutdinamico.Beans.Login;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by EROS on 21/05/2016.
 */
public interface UsuarioService {
    @POST("alumnos/login")
    Call<String> login(@Body Login usuario);
}
