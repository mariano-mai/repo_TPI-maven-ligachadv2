package com.mariano.app.utils.search.jugador.impl;

import java.util.HashMap;
import java.util.Map;

import com.mariano.app.domain.jugador.Jugador;
import com.mariano.app.input.IngresoPorTeclado;
import com.mariano.app.repository.jugador.JugadorRepository;
import com.mariano.app.utils.search.jugador.BuscarElementoJugador;

public class BuscarElementoJugadorImpl implements BuscarElementoJugador{

    Jugador nuevoJugador;

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
        System.out.println("\nSelección de Jugador");
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
            System.out.println("0- El Jugador que busco no se encuentra en la lista.");
            for(Map.Entry<Integer, Jugador> jugador2 : mapaTemporal.entrySet()){
                System.out.println(jugador2.getKey()+"- "+jugador2.getValue().getNombre());
            }
            int valor = IngresoPorTeclado.ingresarEnteroPositivo();
            if(valor==0){
                return null;
            }else{
                nuevoJugador = mapaTemporal.get(valor);
            }
        }else if(i==1){
            System.out.println("\nNo se encontraron Jugadores.");
        }
        return nuevoJugador;
    }

    private Jugador buscarJugadorSuplente(Map<String, Jugador> jugadores){
        Map<Integer, Jugador> mapaTemporal = new HashMap<>();
        System.out.println("\nSelección de Jugador");
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
            System.out.println("0- El Jugador que busco no se encuentra en la lista.");
            for(Map.Entry<Integer, Jugador> jugador2 : mapaTemporal.entrySet()){
                System.out.println(jugador2.getKey()+"- "+jugador2.getValue().getNombre());
            }
            int valor = IngresoPorTeclado.ingresarEnteroPositivo();
            if(valor==0){
                return null;
            }else{
                nuevoJugador = mapaTemporal.get(valor);
            }
        }else if(i==1){
            System.out.println("\nNo se encontraron Jugadores.");
        }
        return nuevoJugador;
    }

}
