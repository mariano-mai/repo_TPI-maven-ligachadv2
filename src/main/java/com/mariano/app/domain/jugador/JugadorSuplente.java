package com.mariano.app.domain.jugador;

public class JugadorSuplente extends Jugador{

    private int partidosIngresados;
    
    public JugadorSuplente() {
    }

    public JugadorSuplente(String nombre, int edad) {
        super(nombre, edad);
    }

    public int getPartidosIngresados() {
        return partidosIngresados;
    }

    public void setPartidosIngresados(int partidosIngresados) {
        this.partidosIngresados = partidosIngresados;
    }

}
