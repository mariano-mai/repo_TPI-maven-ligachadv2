package com.mariano.app.utils.search.partido.impl;

import java.util.HashMap;
import java.util.Map;

import com.mariano.app.domain.Partido;
import com.mariano.app.input.IngresoPorTeclado;
import com.mariano.app.repository.partido.PartidoRepository;
import com.mariano.app.utils.search.partido.BuscarElementoPartido;

public class BuscarElementoPartidoImpl implements BuscarElementoPartido{

    Partido nuevoPartido;

    @Override
    public Partido buscarPartido() {
        return buscarPartido(PartidoRepository.partidosDB);
    }

    private Partido buscarPartido(Map<Integer, Partido> partidos) {
        Map<Integer,Partido> mapaTemporal = new HashMap<>();
        System.out.println("\nSelección de Partido\n");
        int i = 1;
        for(Map.Entry<Integer,Partido> partido1 : partidos.entrySet()) {
            mapaTemporal.put(i,partido1.getValue());
            i++;
        }
        if(i!=1) {
            System.out.println("\nSeleccione el Partido:\n");
            System.out.println("0- El Partido que busco no se encuentra en la lista.");
            for (Map.Entry<Integer,Partido> partido2 : mapaTemporal.entrySet()) {
                System.out.println(partido2.getKey()+"- "+partido2.getValue().getResultado());
            }
            int valor = IngresoPorTeclado.ingresarEnteroPositivo();
            if(valor == 0) {
                return null;
            }else{
                nuevoPartido = mapaTemporal.get(valor);
            }
        }else if(i == 1){
            System.out.println("\nNo se encontraron Partidos.");
        }
        return nuevoPartido;
    }

} 
