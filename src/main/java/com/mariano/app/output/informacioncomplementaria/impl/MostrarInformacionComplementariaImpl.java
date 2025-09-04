package com.mariano.app.output.informacioncomplementaria.impl;

import com.mariano.app.domain.Equipo;
import com.mariano.app.domain.jugador.Jugador;
import com.mariano.app.domain.jugador.JugadorTitular;
import com.mariano.app.output.informacioncomplementaria.MostrarInformacionComplementaria;

public class MostrarInformacionComplementariaImpl implements MostrarInformacionComplementaria{

    public static MostrarInformacionComplementaria mostrarInfo = new MostrarInformacionComplementariaImpl();

    String titular;

    @Override
    public void mostrarJugadoresDe(Equipo equipo) {
        System.out.println("Equipo: "+equipo.getNombre());
        for(Jugador jugador1 : equipo.getJugadores()){
            System.out.printf("%-40s%-30s%n", 
                jugador1.getNombre(), 
                titular = (jugador1.getClass().equals(JugadorTitular.class))? "Titular":"Suplente");
        }
    }

}
