package com.mariano.app.service.menu.impl.registro.equipo.opciones;

import com.mariano.app.input.IngresoPorTeclado;
import com.mariano.app.service.equipo.EquipoService;
import com.mariano.app.service.equipo.impl.EquipoServiceImpl;

public class RegistrarEquipoOpc {

    public static RegistrarEquipoOpc registrarEqOpc = new RegistrarEquipoOpc();

    private EquipoService equipoService = new EquipoServiceImpl();

    public void registrarEquipo(){
        System.out.println("Ingrese nombre del Equipo");
        String nombre = IngresoPorTeclado.ingresarTexto();
        equipoService.crearEquipo(nombre);
        System.out.println("\nEquipo ingresado con éxito.\n");
    }

}
