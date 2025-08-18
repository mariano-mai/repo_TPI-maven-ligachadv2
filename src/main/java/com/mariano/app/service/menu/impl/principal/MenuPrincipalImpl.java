package com.mariano.app.service.menu.impl.principal;

import com.mariano.app.constants.TextConstants;
import com.mariano.app.input.IngresoPorTeclado;
import com.mariano.app.service.menu.MenuService;

public class MenuPrincipalImpl implements MenuService {

    @Override
    public void mostrarMenu() {
        int condicion;
        do{
            System.out.println("Seleccione una opción:");
            System.out.println(TextConstants.OPCIONES_DE_MENU_PRINCIPAL);
            condicion = IngresoPorTeclado.ingresarEnteroPositivo();
            ejecutarOpciones(condicion);
        }while(condicion!=4);
    }

    private void ejecutarOpciones(int condicion){
        switch (condicion) {
            case 1:
                //opciones de registro
                break;
            case 2:
                //opciones de ingreso y modificación de datos
                break;
            case 3:
                //opciones de mostrar información
                break;
            default:
                System.out.println("Fin de programa.");;
        }
    }



}
