package com.mariano.app.utils.search;

import com.mariano.app.domain.Equipo;
import com.mariano.app.domain.jugador.Jugador;

public interface BusquedaDeElemento {

    Equipo buscarEquipo();

    Jugador buscarJugador(boolean esTitular);

}
