package com.example.eros.pichangers.com.example.prueba.miprimerlayoutdinamico.loginUsuario;

import com.example.eros.pichangers.com.example.prueba.miprimerlayoutdinamico.Beans.Login;

import retrofit2.http.POST;

/**
 * Created by EROS on 21/05/2016.
 */
public interface LoginUsuarioPresenter {
    void login(Login usario);
}
