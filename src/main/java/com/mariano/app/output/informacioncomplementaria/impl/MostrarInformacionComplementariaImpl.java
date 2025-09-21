package com.mariano.app.output.informacioncomplementaria.impl;

import java.util.Map;

import com.mariano.app.domain.Equipo;
import com.mariano.app.domain.Partido;
import com.mariano.app.domain.jugador.Jugador;
import com.mariano.app.domain.jugador.JugadorTitular;
import com.mariano.app.output.informacioncomplementaria.MostrarInformacionComplementaria;
import com.mariano.app.repository.partido.PartidoRepository;

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

    @Override
    public void mostrarPartidos() {
        if(PartidoRepository.partidosDB.isEmpty()){
            System.out.println("\n<<Aún no hay Partidos registrados.>>");
        }else{
            System.out.println("\nPARTIDOS:\n");
            System.out.printf("%-20s%-30s%-30s%-30s%n",
                 "Número","Equipo 1","Equipo 2","Resultado");
            for(Map.Entry<Integer, Partido> partido1 : PartidoRepository.partidosDB.entrySet()){
                System.out.printf("%-20d%-30s%-30s%-30s%n",
                    partido1.getKey(),
                    partido1.getValue().getEquipos().get(0).getNombre(),
                    partido1.getValue().getEquipos().get(1).getNombre(),
                    partido1.getValue().getResultado());
            }
        }
    }

}
