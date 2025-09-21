package com.mariano.app.service.partido.impl;

import java.util.List;

import com.mariano.app.domain.Equipo;
import com.mariano.app.domain.Partido;
import com.mariano.app.repository.partido.PartidoRepository;
import com.mariano.app.service.partido.PartidoService;

public class PartidoServiceImpl implements PartidoService{

    @Override
    public Partido crearPartido(List<Equipo> equipos) {
        Partido nuevoPartido = new Partido(equipos);
        System.out.println("\nPartido entre "+nuevoPartido.getEquipos().get(0).getNombre()+
            " y "+nuevoPartido.getEquipos().get(1).getNombre()+" registrado con éxito.\n");
        return PartidoRepository.partidosDB.put(PartidoRepository.partidosDB.size()+1, nuevoPartido);
    }

}
