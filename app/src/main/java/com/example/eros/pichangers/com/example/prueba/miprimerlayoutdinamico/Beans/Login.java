package com.example.eros.pichangers.com.example.prueba.miprimerlayoutdinamico.Beans;

/**
 * Created by EROS on 21/05/2016.
 */
public class Login {
    private String usuario;
    private String password;

    public Login(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }

    public Login() {
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
