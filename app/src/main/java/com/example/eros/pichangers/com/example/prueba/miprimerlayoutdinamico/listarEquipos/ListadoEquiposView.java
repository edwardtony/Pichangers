package com.example.eros.pichangers.com.example.prueba.miprimerlayoutdinamico.listarEquipos;

import com.example.eros.pichangers.com.example.prueba.miprimerlayoutdinamico.Beans.Equipos;

import java.util.List;

/**
 * Created by W3223 on 18/05/2016.
 */
public interface ListadoEquiposView {

    public void setPresenter(ListadoEquiposPresenter presenter);
    public void mostrarListadoEquipos(List<Equipos> equipos);
}
