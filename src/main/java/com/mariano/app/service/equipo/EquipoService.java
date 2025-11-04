package com.mariano.app.service.equipo;

import com.mariano.app.domain.Equipo;
import com.mariano.app.domain.Partido;
import com.mariano.app.domain.jugador.Jugador;

public interface EquipoService {

    Equipo crearEquipo(String nombre);

    void mostrarTodosEquipos();

    void incorporarJugador(Equipo equipo, Jugador jugador);

    void agregarGolA(Equipo equipo, Partido partido);

}
