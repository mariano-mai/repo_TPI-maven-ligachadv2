package com.mariano.app.utils.search.equipo.impl;

import java.util.HashMap;
import java.util.Map;

import com.mariano.app.domain.Equipo;
import com.mariano.app.input.IngresoPorTeclado;
import com.mariano.app.repository.equipo.EquipoRepository;
import com.mariano.app.utils.search.equipo.BuscarElementoEquipo;

public class BuscarElementoEquipoImpl implements BuscarElementoEquipo{

    Equipo nuevoEquipo;

    @Override
    public Equipo buscarEquipo() {
        return buscarEquipo(EquipoRepository.equiposDB);
    }

    private Equipo buscarEquipo(Map<String, Equipo> equipos){
        Map<Integer, Equipo> mapaTemporal = new HashMap<>();
        //Equipo nuevoEquipo = new Equipo();
        System.out.println("\nSelección de Equipo\n");
        int i = 1;
        for(Map.Entry<String, Equipo> equipo1 : equipos.entrySet()){
            mapaTemporal.put(i, equipo1.getValue());
            i++;
        }
        if(i!=1){
            System.out.println("\nSeleccione el Equipo:\n");
            System.out.println("0- El Equipo que busco no se encuentra en la lista.");
            for(Map.Entry<Integer, Equipo> equipo2 : mapaTemporal.entrySet()){
                System.out.println(equipo2.getKey()+"- "+equipo2.getValue().getNombre());
            }
            int valor = IngresoPorTeclado.ingresarEnteroPositivo();
            //nuevoEquipo = mapaTemporal.get(valor);
            if(valor==0){
                return null;
            }else{
                nuevoEquipo = mapaTemporal.get(valor);
            }
        }else if(i==1){
            System.out.println("\nNo se encontraron equipos.");
        }
        return nuevoEquipo;
    }

    @Override
    public Equipo buscarEquipoExcepto(Equipo equipo) {
        return buscarEquipoExcepto(EquipoRepository.equiposDB, equipo);
    }

    private Equipo buscarEquipoExcepto(Map<String, Equipo> equipos, Equipo equipoIgnorado) {
        Map<Integer, Equipo> mapaTemporal = new HashMap<>();
        System.out.println("\nSelección de Equipo\n");
        int i = 1;
        for(Map.Entry<String, Equipo> equipo1 : equipos.entrySet()){
            if(!equipo1.getValue().equals(equipoIgnorado)){
                mapaTemporal.put(i, equipo1.getValue());
                i++;
            }
        }
        if(i!=1){
            System.out.println("\nSeleccione el Equipo:\n");
            System.out.println("0- El Equipo que busco no se encuentra en la lista.");
            for(Map.Entry<Integer, Equipo> equipo2 : mapaTemporal.entrySet()){
                System.out.println(equipo2.getKey()+"- "+equipo2.getValue().getNombre());
            }
            int valor = IngresoPorTeclado.ingresarEnteroPositivo();
            if(valor==0){
                return null;
            }else{
                nuevoEquipo = mapaTemporal.get(valor);
            }
        }else if(i==1){
            System.out.println("\nNo se encontraron equipos.");
        }
        return nuevoEquipo;
    }

}
