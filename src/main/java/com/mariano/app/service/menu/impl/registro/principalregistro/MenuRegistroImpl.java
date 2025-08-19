package com.mariano.app.service.menu.impl.registro.principalregistro;

import com.mariano.app.constants.TextConstants;
import com.mariano.app.input.IngresoPorTeclado;
import com.mariano.app.service.menu.MenuService;
import com.mariano.app.service.menu.impl.registro.jugador.MenuRegistroJugadorImpl;


public class MenuRegistroImpl implements MenuService{

    public static MenuService menuRegistro = new MenuRegistroImpl();

    @Override
    public void mostrarMenu() {
        int condicion;
        do{
            System.out.println("Seleccione una opción:");
            System.out.println(TextConstants.OPCIONES_DE_MENU_REGISTRO);
            condicion = IngresoPorTeclado.ingresarNumero();
            ejecutarOpciones(condicion);
        }while(condicion!=4);
    }

    private void ejecutarOpciones(int condicion){
        switch (condicion) {
            case 1:
                //menú registro de jugador
                MenuRegistroJugadorImpl.menuRegistroJug.mostrarMenu();
                break;
            case 2:
                //menú registro de equipo
                break;
            case 3:
                //menú registro de partido
                break;
            default:
        }
    }

}
