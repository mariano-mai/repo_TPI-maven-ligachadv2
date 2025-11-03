package com.mariano.app.service.jugador.impl;

import java.util.Map;

import com.mariano.app.constants.TextConstants;
import com.mariano.app.domain.jugador.Jugador;
import com.mariano.app.domain.jugador.JugadorSuplente;
import com.mariano.app.domain.jugador.JugadorTitular;
import com.mariano.app.input.IngresoPorTeclado;
import com.mariano.app.repository.jugador.JugadorRepository;
import com.mariano.app.service.jugador.JugadorService;

public class JugadorServiceImpl implements JugadorService{

    String titular;

    @Override
    public Jugador crearJugador(String nombre, int edad) {
        Jugador nuevoJugador = nuevoJugador(nombre, edad);
        return JugadorRepository.jugadoresDB.put(nuevoJugador.getNombre(), nuevoJugador);
    }

    private Jugador nuevoJugador(String nombre, int edad){
        System.out.println(TextConstants.TITULAR_O_SUPLENTE);
        int condicion = IngresoPorTeclado.ingresarNumero();
        if(condicion==1){
            return new JugadorTitular(nombre, edad);
        }else{
            return new JugadorSuplente(nombre, edad);
        }
    }

    @Override
    public void mostrarTodosJugadores() {
        System.out.println("\nTodos Los Jugadores\n");
        System.out.printf("%-40s%-30s%-30s%n", "NOMBRE","TIT/SUP","GOLES");
        for(Map.Entry<String, Jugador> jugador1 : JugadorRepository.jugadoresDB.entrySet()){
            System.out.printf("%-40s%-30s%-30d%n", 
                jugador1.getValue().getNombre(),
                titular=(jugador1.getValue().getClass().equals(JugadorTitular.class))?"Titular":"Suplente",
                jugador1.getValue().getGoles());
        }
    }

    @Override
    public void ingresarGolA(Jugador jugador) {
        int golesDeJugador = jugador.getGoles();
        jugador.setGoles(golesDeJugador+1);
    }

}
