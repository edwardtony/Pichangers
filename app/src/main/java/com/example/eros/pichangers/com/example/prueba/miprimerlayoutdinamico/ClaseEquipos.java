package com.example.eros.pichangers.com.example.prueba.miprimerlayoutdinamico;

import com.example.prueba.miprimerlayoutdinamico.Beans.Jugadores;

import java.util.List;

/**
 * Created by w3201 on 11/05/2016.
 */
public class ClaseEquipos {

    private String nombreEquipo;
    private int imagen;
    private List<Jugadores> jugadores;
    private int cantJugadores;

    public ClaseEquipos() {
    }

    public ClaseEquipos(String nombreEquipo, int imagen, List<Jugadores> jugadores, int cantJugadores) {
        this.nombreEquipo = nombreEquipo;
        this.imagen = imagen;
        this.jugadores = jugadores;
        this.cantJugadores = cantJugadores;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public List<Jugadores> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugadores> jugadores) {
        this.jugadores = jugadores;
    }

    public int getCantJugadores() {
        return cantJugadores;
    }

    public void setCantJugadores(int cantJugadores) {
        this.cantJugadores = cantJugadores;
    }

    @Override
    public String toString() {
        return "ClaseEquipos{" +
                "nombreEquipo='" + nombreEquipo + '\'' +
                ", imagen=" + imagen +
                ", jugadores=" + jugadores +
                ", cantJugadores=" + cantJugadores +
                '}';
    }
}
