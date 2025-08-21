package com.mariano.app.service.menu.impl.mostrar.jugador.opciones;

import com.mariano.app.service.jugador.JugadorService;
import com.mariano.app.service.jugador.impl.JugadorServiceImpl;
import com.mariano.app.service.menu.impl.mostrar.MostrarTodosInt;

public class MostrarTodosJugadoresOpc implements MostrarTodosInt{

    public static MostrarTodosInt mostrarTodosJug = new MostrarTodosJugadoresOpc();

    private JugadorService jugadorService = new JugadorServiceImpl();

    @Override
    public void mostrarTodos(){
        jugadorService.mostrarTodosJugadores();
    }

}
