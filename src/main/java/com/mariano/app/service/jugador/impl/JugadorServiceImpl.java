package com.mariano.app.service.jugador.impl;

import com.mariano.app.constants.TextConstants;
import com.mariano.app.domain.jugador.Jugador;
import com.mariano.app.domain.jugador.JugadorSuplente;
import com.mariano.app.domain.jugador.JugadorTitular;
import com.mariano.app.input.IngresoPorTeclado;
import com.mariano.app.repository.jugador.JugadorRepository;
import com.mariano.app.service.jugador.JugadorService;

public class JugadorServiceImpl implements JugadorService{

    @Override
    public Jugador crearJugador(String nombre, int edad) {
        Jugador nuevoJugador = nuevoJugador(nombre, edad);
        return JugadorRepository.jugadoresDB.put(nuevoJugador.getNombre(), nuevoJugador);
    }

    private Jugador nuevoJugador(String nombre, int edad){
        System.out.println(TextConstants.TITULAR_O_SUPLENTE);
        int condicion = IngresoPorTeclado.ingresarEnteroPositivo();
        if(condicion==1){
            return new JugadorTitular(nombre, edad);
        }else{
            return new JugadorSuplente(nombre, edad);
        }
    }

}
