package com.example.eros.pichangers.com.example.prueba.miprimerlayoutdinamico.loginUsuario;

import com.example.eros.pichangers.com.example.prueba.miprimerlayoutdinamico.Beans.Login;
import com.example.eros.pichangers.com.example.prueba.miprimerlayoutdinamico.remote.UsuarioService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by EROS on 21/05/2016.
 */
public class LoginUsuarioPresenterImpl implements  LoginUsuarioPresenter {

    LoginUsuarioView mView;

    @Override
    public void login(Login usario) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://1-dot-pichangers-1307.appspot.com/rest/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        UsuarioService usuarioService = retrofit.create(UsuarioService.class);
        usuarioService.login(usario).enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                mView.login();
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {

            }
        });
    }
}
