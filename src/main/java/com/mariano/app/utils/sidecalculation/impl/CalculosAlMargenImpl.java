package com.mariano.app.utils.sidecalculation.impl;

import com.mariano.app.domain.Equipo;
import com.mariano.app.domain.jugador.Jugador;
import com.mariano.app.domain.jugador.JugadorTitular;
import com.mariano.app.utils.sidecalculation.CalculosAlMargen;

public class CalculosAlMargenImpl implements CalculosAlMargen{

    public static CalculosAlMargen calcMargen = new CalculosAlMargenImpl();

    @Override
    public int cantidadDeTitulares(Equipo equipo) {
        int cantidad = 0;
        for(Jugador jugador : equipo.getJugadores()){
            if (jugador.getClass().equals(JugadorTitular.class)) {
                cantidad=+1;
            }
        }
        return cantidad;
    }

}
