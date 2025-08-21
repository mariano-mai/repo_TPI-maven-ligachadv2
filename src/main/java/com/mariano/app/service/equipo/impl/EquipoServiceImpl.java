package com.mariano.app.service.equipo.impl;

import java.util.Map;

import com.mariano.app.domain.Equipo;
import com.mariano.app.repository.equipo.EquipoRepository;
import com.mariano.app.service.equipo.EquipoService;

public class EquipoServiceImpl implements EquipoService{

    @Override
    public Equipo crearEquipo(String nombre) {
        Equipo nuevoEquipo = new Equipo(nombre);
        return EquipoRepository.equiposDB.put(nuevoEquipo.getNombre(), nuevoEquipo);
    }

    @Override
    public void mostrarTodosEquipos() {
        System.out.println("\nTodos Los Equipos\n");
        System.out.printf("%-40s%-30s%-30s%n", "NOMBRE", "CANT DE GOLES", "PROM GOLES/PARTIDO");
        for(Map.Entry<String,Equipo> equipo1 : EquipoRepository.equiposDB.entrySet()){
            System.out.printf("%-40s%-30d%-30d%n", 
                equipo1.getValue().getNombre(), 
                equipo1.getValue().getGoles(), 
                0);
        }
    }

}
