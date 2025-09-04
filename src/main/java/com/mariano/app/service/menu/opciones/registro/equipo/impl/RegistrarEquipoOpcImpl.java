package com.mariano.app.service.menu.opciones.registro.equipo.impl;

import com.mariano.app.domain.Equipo;
import com.mariano.app.domain.jugador.Jugador;
import com.mariano.app.input.IngresoPorTeclado;
import com.mariano.app.output.informacioncomplementaria.impl.MostrarInformacionComplementariaImpl;
import com.mariano.app.service.equipo.EquipoService;
import com.mariano.app.service.equipo.impl.EquipoServiceImpl;
import com.mariano.app.service.menu.opciones.registro.equipo.RegistrarEquipoOpc;
import com.mariano.app.utils.booleanoptions.OpcionesBooleanas;
import com.mariano.app.utils.booleanoptions.impl.OpcionesBooleanasImpl;
import com.mariano.app.utils.search.BusquedaDeElemento;
import com.mariano.app.utils.search.impl.BusquedaDeElementoImpl;

public class RegistrarEquipoOpcImpl implements RegistrarEquipoOpc{

    private EquipoService equipoService = new EquipoServiceImpl();

    private BusquedaDeElemento buscarElemento = new BusquedaDeElementoImpl();
    private OpcionesBooleanas opcionesBooleanas = new OpcionesBooleanasImpl();

    Equipo nuevoEquipo;
    Jugador nuevoJugador;
    boolean esTitular;

    @Override
    public void registrarEquipo() {
        System.out.println("Ingrese nombre del Equipo");
        String nombre = IngresoPorTeclado.ingresarTexto();
        equipoService.crearEquipo(nombre);
        System.out.println("\nEquipo ingresado con éxito.\n");
    }

    @Override
    public void incorporarJugador() {
        try {
            nuevoEquipo = buscarElemento.buscarEquipo();
        } catch (NullPointerException e) {
            System.out.println("\nAsegúrece de que el Equipo que busca esté registrado.\n");
        }
        esTitular = opcionesBooleanas.siONo("Titular", "Suplente");
        try {
            nuevoJugador = buscarElemento.buscarJugador(esTitular);
        } catch (NullPointerException e) {
            System.out.println("\nAsegúrece de que el Jugador que busca esté registrado.\n");
        }
        equipoService.incorporarJugador(nuevoEquipo, nuevoJugador);
        System.out.println("\nEl Jugador "+nuevoJugador.getNombre()+" fue inconrporado con éxito al Equipo "+
            nuevoEquipo.getNombre()+".\n");
        MostrarInformacionComplementariaImpl.mostrarInfo.mostrarJugadoresDe(nuevoEquipo);
    }

}
