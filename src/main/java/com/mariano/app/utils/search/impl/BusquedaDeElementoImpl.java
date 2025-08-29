package com.mariano.app.utils.search.impl;

import java.util.HashMap;
import java.util.Map;

import com.mariano.app.domain.Equipo;
import com.mariano.app.domain.jugador.Jugador;
import com.mariano.app.domain.jugador.JugadorSuplente;
import com.mariano.app.domain.jugador.JugadorTitular;
import com.mariano.app.input.IngresoPorTeclado;
import com.mariano.app.repository.equipo.EquipoRepository;
import com.mariano.app.repository.jugador.JugadorRepository;
import com.mariano.app.utils.search.BusquedaDeElemento;

public class BusquedaDeElementoImpl implements BusquedaDeElemento{

    @Override
    public Equipo buscarEquipo() {
        return buscarEquipo(EquipoRepository.equiposDB);
    }

    private Equipo buscarEquipo(Map<String, Equipo> equipos){
        Map<Integer, Equipo> mapaTemporal = new HashMap<>();
        Equipo nuevoEquipo = new Equipo();
        System.out.println("\nSelección de Equipo\n");
        int i = 1;
        for(Map.Entry<String, Equipo> equipo1 : equipos.entrySet()){
            mapaTemporal.put(i, equipo1.getValue());
            i++;
        }
        if(i!=1){
            System.out.println("\nSeleccione el Equipo:\n");
            for(Map.Entry<Integer, Equipo> equipo2 : mapaTemporal.entrySet()){
                System.out.println(equipo2.getKey()+"- "+equipo2.getValue().getNombre());
            }
            int valor = IngresoPorTeclado.ingresarNumero();
            nuevoEquipo = mapaTemporal.get(valor);
        }else if(i==1){
            System.out.println("\nNo se encontraron equipos.");
        }
        return nuevoEquipo;
    }

    @Override
    public Jugador buscarJugador(boolean esTitular) {
        if(esTitular){
            return buscarJugadorTitular(JugadorRepository.jugadoresDB);
        }else{
            return buscarJugadorSuplente(JugadorRepository.jugadoresDB);
        }
    }

    private Jugador buscarJugadorTitular(Map<String, Jugador> jugadores){
        Map<Integer, Jugador> mapaTemporal = new HashMap<>();
        Jugador nuevoJugador = new JugadorTitular();
        System.out.println("\nSelección de Jugador\n");
        System.out.println("\nIngrese la primer letra del APELLIDO del Jugador:");
        String letra = IngresoPorTeclado.ingresarTexto().toUpperCase();
        int i = 1;
        for(Map.Entry<String, Jugador> jugador1 : jugadores.entrySet()){
            if(jugador1.getValue().getNombre().startsWith(letra)){
                mapaTemporal.put(i, jugador1.getValue());
                i++;
            }
        }
        if(i!=1){
            System.out.println("\nSeleccione el Jugador:\n");
            for(Map.Entry<Integer, Jugador> jugador2 : mapaTemporal.entrySet()){
                System.out.println(jugador2.getKey()+"- "+jugador2.getValue().getNombre());
            }
            int valor = IngresoPorTeclado.ingresarNumero();
            nuevoJugador = mapaTemporal.get(valor);
        }else if(i==1){
            System.out.println("\nNo se encontraron Jugadores.");
        }
        return nuevoJugador;
    }

    private Jugador buscarJugadorSuplente(Map<String, Jugador> jugadores){
        Map<Integer, Jugador> mapaTemporal = new HashMap<>();
        Jugador nuevoJugador = new JugadorSuplente();
        System.out.println("\nSelección de Jugador\n");
        System.out.println("\nIngrese la primer letra del APELLIDO del Jugador:");
        String letra = IngresoPorTeclado.ingresarTexto().toUpperCase();
        int i = 1;
        for(Map.Entry<String, Jugador> jugador1 : jugadores.entrySet()){
            if(jugador1.getValue().getNombre().startsWith(letra)){
                mapaTemporal.put(i, jugador1.getValue());
                i++;
            }
        }
        if(i!=1){
            System.out.println("\nSeleccione el Jugador:\n");
            for(Map.Entry<Integer, Jugador> jugador2 : mapaTemporal.entrySet()){
                System.out.println(jugador2.getKey()+"- "+jugador2.getValue().getNombre());
            }
            int valor = IngresoPorTeclado.ingresarNumero();
            nuevoJugador = mapaTemporal.get(valor);
        }else if(i==1){
            System.out.println("\nNo se encontraron Jugadores.");
        }
        return nuevoJugador;
    }

}
