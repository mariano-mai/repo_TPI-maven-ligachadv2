package com.mariano.app.service.menu.impl.registro.equipo;

import com.mariano.app.constants.TextConstants;
import com.mariano.app.input.IngresoPorTeclado;
import com.mariano.app.service.menu.MenuService;
import com.mariano.app.service.menu.opciones.registro.equipo.RegistrarEquipoOpc;
import com.mariano.app.service.menu.opciones.registro.equipo.impl.RegistrarEquipoOpcImpl;

public class MenuRegistroEquipoImpl implements MenuService{

    public static MenuService menuRegistroEq = new MenuRegistroEquipoImpl();

    private RegistrarEquipoOpc registrarEquipoOpc = new RegistrarEquipoOpcImpl();

    @Override
    public void mostrarMenu() {
        int condicion;
        do{
            System.out.println("Seleccione una opción:");
            System.out.println(TextConstants.OPCIONES_DE_MENU_REGISTRO_EQUIPOS);
            condicion = IngresoPorTeclado.ingresarEnteroPositivo();
            ejecutarOpciones(condicion);
        }while(condicion!=3);
    }

    private void ejecutarOpciones(int condicion){
        switch (condicion) {
            case 1:
                registrarEquipoOpc.registrarEquipo();
                break;
            case 2:
                //incorporar un Jugador a un Equipo
                registrarEquipoOpc.incorporarJugadorV2();
                break;
            default:
                break;
        }
    }

}
