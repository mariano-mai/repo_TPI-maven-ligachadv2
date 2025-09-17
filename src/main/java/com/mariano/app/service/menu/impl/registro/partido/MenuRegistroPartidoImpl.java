package com.mariano.app.service.menu.impl.registro.partido;

import com.mariano.app.constants.TextConstants;
import com.mariano.app.input.IngresoPorTeclado;
import com.mariano.app.service.menu.MenuService;
import com.mariano.app.service.menu.opciones.registro.partido.RegistrarPartidoOpc;
import com.mariano.app.service.menu.opciones.registro.partido.impl.RegistrarPartidoOpcImpl;

public class MenuRegistroPartidoImpl implements MenuService{

    public static MenuService menuRegistroPart = new MenuRegistroPartidoImpl();

    private RegistrarPartidoOpc registrarPartidoOpc = new RegistrarPartidoOpcImpl();

    @Override
    public void mostrarMenu() {
        int condicion;
        do {
            //mostrar los partidos actuales, si los hay
            System.out.println("\nSeleccione una opción:");
            System.out.println(TextConstants.OPCIONES_DE_MENU_REGISTRO_PARTIDOS);
            condicion = IngresoPorTeclado.ingresarEnteroPositivo();
            ejecutarOpciones(condicion);
        } while (condicion!=2);
    }

    private void ejecutarOpciones(int condicion){
        switch (condicion) {
            case 1:
                //registrar un partido
                registrarPartidoOpc.registrarPartido();
                break;
            default:
                break;
        }
    }

}
