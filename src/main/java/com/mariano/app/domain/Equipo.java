package com.mariano.app.domain;

import java.util.ArrayList;
import java.util.List;

import com.mariano.app.domain.jugador.Jugador;

public class Equipo {

    private String nombre;
    private List<Jugador> jugadores = new ArrayList<>();
    private List<Gol> goles = new ArrayList<>();
    
    public Equipo() {
    }

    public Equipo(String nombre) {
        this.nombre = nombre;
    }

    public Equipo(String nombre, List<Jugador> jugadores) {
        this.nombre = nombre;
        this.jugadores = jugadores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public List<Gol> getGoles() {
        return goles;
    }

    public void setGoles(List<Gol> goles) {
        this.goles = goles;
    }

    

}
