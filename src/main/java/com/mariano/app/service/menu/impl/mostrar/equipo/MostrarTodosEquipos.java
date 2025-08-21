package com.mariano.app.service.menu.impl.mostrar.equipo;

import com.mariano.app.service.equipo.EquipoService;
import com.mariano.app.service.equipo.impl.EquipoServiceImpl;
import com.mariano.app.service.menu.impl.mostrar.MostrarTodosInt;

public class MostrarTodosEquipos implements MostrarTodosInt{

    public static MostrarTodosInt mostrarTodosEq = new MostrarTodosEquipos();

    private EquipoService equipoService = new EquipoServiceImpl();

    @Override
    public void mostrarTodos() {
        equipoService.mostrarTodosEquipos();
    }



}
