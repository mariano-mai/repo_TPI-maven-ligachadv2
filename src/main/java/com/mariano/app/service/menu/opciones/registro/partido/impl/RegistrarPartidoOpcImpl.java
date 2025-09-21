package com.mariano.app.service.menu.opciones.registro.partido.impl;

import java.util.ArrayList;
import java.util.List;

import com.mariano.app.domain.Equipo;
import com.mariano.app.service.menu.opciones.registro.partido.RegistrarPartidoOpc;
import com.mariano.app.service.partido.PartidoService;
import com.mariano.app.service.partido.impl.PartidoServiceImpl;
import com.mariano.app.utils.search.equipo.BuscarElementoEquipo;
import com.mariano.app.utils.search.equipo.impl.BuscarElementoEquipoImpl;

public class RegistrarPartidoOpcImpl implements RegistrarPartidoOpc{

    private PartidoService partidoService = new PartidoServiceImpl();
    private BuscarElementoEquipo buscarEquipo = new BuscarElementoEquipoImpl();

    Equipo equipo1;
    Equipo equipo2;
    List<Equipo> equipos;

    @Override
    public void registrarPartido() {
        partidoService.crearPartido(designarEquipos());
    }

    private List<Equipo> designarEquipos() {
        equipos = new ArrayList<>();
        try {
            equipo1 = buscarEquipo.buscarEquipo();
        } catch (NullPointerException e) {
            System.out.println("\nAsegúrese que el Equipo que busca está registrado.\n");
        }
        if(equipo1==null){
            System.out.println("\nPor favor, registre el Equipo.\n");
        }else {
            equipos.add(equipo1);
            try {
                equipo2 = buscarEquipo.buscarEquipoExcepto(equipo1);
            } catch (NullPointerException e) {
                System.out.println("\nAsegúrese que el Equipo que busca está registrado.\n");
            }
            if(equipo2==null){
                System.out.println("\nPor favor, registre el Equipo.\n");
            }else{
                equipos.add(equipo2);
            }
        }
        return equipos;
    }

}
