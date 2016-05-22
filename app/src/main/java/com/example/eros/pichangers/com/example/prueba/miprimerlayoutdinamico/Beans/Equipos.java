package com.example.eros.pichangers.com.example.prueba.miprimerlayoutdinamico.Beans;

/**
 * Created by W3223 on 18/05/2016.
 */
public class Equipos {
    public int id;
    public String nombre;
    public int partidosGanados;
    public int partidosPerdidos;
    public String urlFoto;

    public Equipos() {
    }

    public Equipos(int id, String nombre, int partidosGanados, int partidosPerdidos, String urlFoto) {
        this.id = id;
        this.nombre = nombre;
        this.partidosGanados = partidosGanados;
        this.partidosPerdidos = partidosPerdidos;
        this.urlFoto = urlFoto;
    }
}
