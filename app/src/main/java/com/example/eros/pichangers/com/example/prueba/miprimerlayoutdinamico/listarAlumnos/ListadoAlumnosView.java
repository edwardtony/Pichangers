package com.example.eros.pichangers.com.example.prueba.miprimerlayoutdinamico.listarAlumnos;

import com.example.eros.pichangers.com.example.prueba.miprimerlayoutdinamico.Beans.Alumnos;

import java.util.List;

/**
 * Created by EROS on 21/05/2016.
 */
public interface ListadoAlumnosView {
    public void setPresenter(ListadoAlumnosPresenter presenter);
    public void mostrarListadoEquipos(List<Alumnos> alumnos);
}
