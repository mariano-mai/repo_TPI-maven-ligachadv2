package com.mariano.app.domain;

import java.util.List;
import java.util.Map;

public class Partido {

    private List<Equipo> equipos;
    private String resultado;
    private Map<String, Integer> golesPorJugador;
    
    public Partido(List<Equipo> equipos) {
        this.equipos = equipos;
    }

    public List<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(List<Equipo> equipos) {
        this.equipos = equipos;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public Map<String, Integer> getGolesPorJugador() {
        return golesPorJugador;
    }

    public void setGolesPorJugador(Map<String, Integer> golesPorJugador) {
        this.golesPorJugador = golesPorJugador;
    }

    

}
