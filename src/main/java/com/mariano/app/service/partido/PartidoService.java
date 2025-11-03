package com.mariano.app.service.partido;

import java.util.List;

import com.mariano.app.domain.Equipo;
import com.mariano.app.domain.Partido;
import com.mariano.app.domain.jugador.Jugador;

public interface PartidoService {

    Partido crearPartido(List<Equipo> equipos);

    void agregarGolDe(Jugador jugador, Partido partido);

}
