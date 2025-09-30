package com.mariano.app.service.menu.impl.ingresoinfo;

import com.mariano.app.constants.TextConstants;
import com.mariano.app.input.IngresoPorTeclado;
import com.mariano.app.service.menu.MenuService;

public class MenuIngresoInfoImpl implements MenuService{

    public static MenuService menuIngrInfo = new MenuIngresoInfoImpl();

    @Override
    public void mostrarMenu() {
        int condicion;
        do {
            System.out.println("Seleccione una opción:");
            System.out.println(TextConstants.OPCIONES_DE_MENU_INGRESOINFORMACION);
            condicion = IngresoPorTeclado.ingresarEnteroPositivo();
            ejecutarOpciones(condicion);
        } while (condicion!=4);
    }

    private void ejecutarOpciones(int condicion){
        switch (condicion) {
            case 1:
                //ingresar información durante un Partido
                break;
            case 2:
                //modificar datos de un Equipo
                break;
            case 3:
                //modificar datos de un Jugador
                break;
            default:
                break;
        }
    }

}
