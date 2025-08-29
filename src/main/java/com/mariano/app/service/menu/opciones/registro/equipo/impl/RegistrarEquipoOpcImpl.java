package com.mariano.app.service.menu.opciones.registro.equipo.impl;

import com.mariano.app.input.IngresoPorTeclado;
import com.mariano.app.service.equipo.EquipoService;
import com.mariano.app.service.equipo.impl.EquipoServiceImpl;
import com.mariano.app.service.menu.opciones.registro.equipo.RegistrarEquipoOpc;

public class RegistrarEquipoOpcImpl implements RegistrarEquipoOpc{

    private EquipoService equipoService = new EquipoServiceImpl();

    @Override
    public void registrarEquipo() {
        System.out.println("Ingrese nombre del Equipo");
        String nombre = IngresoPorTeclado.ingresarTexto();
        equipoService.crearEquipo(nombre);
        System.out.println("\nEquipo ingresado con éxito.\n");
    }

    @Override
    public void incorporarJugador() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'incorporarJugador'");
    }

}
