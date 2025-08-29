package com.mariano.app.domain.jugador;

public class JugadorTitular extends Jugador{

    private int minutosJugados;

    public JugadorTitular() {
    }

    public JugadorTitular(String nombre, int edad) {
        super(nombre, edad);
    }

    public int getMinutosJugados() {
        return minutosJugados;
    }

    public void setMinutosJugados(int minutosJugados) {
        this.minutosJugados = minutosJugados;
    }

}
