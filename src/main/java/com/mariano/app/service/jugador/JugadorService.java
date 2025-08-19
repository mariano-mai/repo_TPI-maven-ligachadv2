package com.mariano.app.service.jugador;

import com.mariano.app.domain.jugador.Jugador;

public interface JugadorService {

    Jugador crearJugador(String nombre, int edad);

    void mostrarTodosJugadores();

}
