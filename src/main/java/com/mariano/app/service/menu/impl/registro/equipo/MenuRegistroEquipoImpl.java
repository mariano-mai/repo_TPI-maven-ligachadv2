package com.mariano.app.service.menu.impl.registro.equipo;

import com.mariano.app.constants.TextConstants;
import com.mariano.app.input.IngresoPorTeclado;
import com.mariano.app.service.menu.MenuService;
import com.mariano.app.service.menu.impl.registro.equipo.opciones.RegistrarEquipoOpc;

public class MenuRegistroEquipoImpl implements MenuService{

    public static MenuService menuRegistroEq = new MenuRegistroEquipoImpl();

    @Override
    public void mostrarMenu() {
        int condicion;
        do{
            System.out.println("Seleccione una opción:");
            System.out.println(TextConstants.OPCIONES_DE_MENU_REGISTRO_EQUIPOS);
            condicion = IngresoPorTeclado.ingresarNumero();
            ejecutarOpciones(condicion);
        }while(condicion!=3);
    }

    private void ejecutarOpciones(int condicion){
        switch (condicion) {
            case 1:
                RegistrarEquipoOpc.registrarEqOpc.registrarEquipo();
                break;
            case 2:
                //incorporar un Jugador a un Equipo
                break;
            default:
                break;
        }
    }

}
