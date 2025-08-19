package com.mariano.app.service.menu.impl.mostrar.jugador.opciones;

import com.mariano.app.service.jugador.JugadorService;
import com.mariano.app.service.jugador.impl.JugadorServiceImpl;

public class MostrarTodosJugadoresOpc {

    public static MostrarTodosJugadoresOpc mostrarTodos = new MostrarTodosJugadoresOpc();

    private JugadorService jugadorService = new JugadorServiceImpl();

    public void mostrarTodos(){
        jugadorService.mostrarTodosJugadores();
    }

}
