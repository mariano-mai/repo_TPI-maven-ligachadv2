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
import com.mariano.app.utils.search.equipo.BuscarElementoEquipo;
import com.mariano.app.utils.search.equipo.impl.BuscarElementoEquipoImpl;
import com.mariano.app.utils.search.jugador.BuscarElementoJugador;
import com.mariano.app.utils.search.jugador.impl.BuscarElementoJugadorImpl;

public class RegistrarEquipoOpcImpl implements RegistrarEquipoOpc{

    private EquipoService equipoService = new EquipoServiceImpl();

    private BuscarElementoEquipo buscarEquipo = new BuscarElementoEquipoImpl();
    private BuscarElementoJugador buscarJugador = new BuscarElementoJugadorImpl();
    private OpcionesBooleanas opcionesBooleanas = new OpcionesBooleanasImpl();

    Equipo nuevoEquipo;
    Jugador nuevoJugador;
    boolean esTitular;

    @Override
    public void registrarEquipo() {
        System.out.println("Ingrese nombre del Equipo");
        String nombre = IngresoPorTeclado.ingresarTexto().toUpperCase();
        equipoService.crearEquipo(nombre);
        System.out.println("\nEquipo ingresado con éxito.\n");
    }

    @Override
    public void incorporarJugador() {
        try {
            nuevoEquipo = buscarEquipo.buscarEquipo();
        } catch (NullPointerException e) {
            System.out.println("\nAsegúrece de que el Equipo que busca esté registrado.\n");
        }
        esTitular = opcionesBooleanas.siONo("Titular", "Suplente");
        try {
            nuevoJugador = buscarJugador.buscarJugador(esTitular);
        } catch (NullPointerException e) {
            System.out.println("\nAsegúrece de que el Jugador que busca esté registrado.\n");
        }
        equipoService.incorporarJugador(nuevoEquipo, nuevoJugador);
        System.out.println("\nEl Jugador "+nuevoJugador.getNombre()+" fue inconrporado con éxito al Equipo "+
            nuevoEquipo.getNombre()+".\n");
        MostrarInformacionComplementariaImpl.mostrarInfo.mostrarJugadoresDe(nuevoEquipo);
    }

    @Override
    public void incorporarJugadorV2() {
        try {
            nuevoEquipo = buscarEquipo.buscarEquipo();
        } catch (NullPointerException e) {
            System.out.println("\nAsegúrece de que el Equipo que busca esté registrado.\n");
        }
        if(nuevoEquipo==null){
            System.out.println("\nPor favor, registre el Equipo.\n");
        }else{
            esTitular = opcionesBooleanas.siONo("Titular", "Suplente");
            try {
                nuevoJugador = buscarJugador.buscarJugador(esTitular);
            } catch (NullPointerException e) {
                System.out.println("\nAsegúrese de que el Jugador que busca esté registrado.\n");
            }
            if(nuevoJugador==null){
                System.out.println("\nPor favor, registre el Jugador.\n");
            }else{
                equipoService.incorporarJugador(nuevoEquipo, nuevoJugador);
                System.out.println("\nEl Jugador "+nuevoJugador.getNombre()+
                    " fue inconrporado con éxito al Equipo "+nuevoEquipo.getNombre()+".\n");
                MostrarInformacionComplementariaImpl.mostrarInfo.mostrarJugadoresDe(nuevoEquipo);
            }
        }
    }

}
