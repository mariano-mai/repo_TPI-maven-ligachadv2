package com.mariano.app.utils.search.equipo;

import com.mariano.app.domain.Equipo;

public interface BuscarElementoEquipo {

    Equipo buscarEquipo();

    Equipo buscarEquipoExcepto(Equipo equipo);

}
