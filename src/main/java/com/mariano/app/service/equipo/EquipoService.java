package com.mariano.app.service.equipo;

import com.mariano.app.domain.Equipo;

public interface EquipoService {

    Equipo crearEquipo(String nombre);

    void mostrarTodosEquipos();

}
