package com.mariano.app.repository.bootstrapdata.impl;

import com.mariano.app.domain.Equipo;
import com.mariano.app.repository.bootstrapdata.BootstrapData;
import com.mariano.app.service.equipo.EquipoService;
import com.mariano.app.service.equipo.impl.EquipoServiceImpl;
import com.mariano.app.utils.numbergenerator.impl.GeneradorDeEnterosImpl;

public class BootstrapDataImpl implements BootstrapData{

    public static BootstrapData bootstrap = new BootstrapDataImpl();

    EquipoService equipoService = new EquipoServiceImpl();

    Equipo nuevoEquipo;
    String nombreDeEquipo;

    @Override
    public void crearEquipos() {
        for(int i=0; i<10; i++){
            nombreDeEquipo = BootstrapData.NOMBRES_DE_EQUIPOS[GeneradorDeEnterosImpl.generador.numeroEnteroAlAzar(0, 50)];
            nuevoEquipo = equipoService.crearEquipo(nombreDeEquipo);
        }
    }

}
