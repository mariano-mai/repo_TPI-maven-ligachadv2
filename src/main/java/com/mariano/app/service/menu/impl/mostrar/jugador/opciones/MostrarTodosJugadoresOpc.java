package com.mariano.app.service.menu.impl.mostrar.jugador.opciones;

import com.mariano.app.service.jugador.JugadorService;

public class MostrarTodosJugadoresOpc {

    public static MostrarTodosJugadoresOpc mostrarTodos;

    private JugadorService jugadorService;

    public void mostrarTodos(){
        jugadorService.mostrarTodosJugadores();
    }

}
