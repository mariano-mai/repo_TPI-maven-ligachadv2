package com.mariano.app.service.menu.impl.registro.jugador;

import com.mariano.app.constants.TextConstants;
import com.mariano.app.input.IngresoPorTeclado;
import com.mariano.app.service.menu.MenuService;
import com.mariano.app.service.menu.opciones.registro.jugador.RegistrarJugadorOpc;
import com.mariano.app.service.menu.opciones.registro.jugador.impl.RegistrarJugadorOpcImpl;

public class MenuRegistroJugadorImpl implements MenuService{

    public static MenuService menuRegistroJug = new MenuRegistroJugadorImpl();

    private RegistrarJugadorOpc registrarJugadorOpc = new RegistrarJugadorOpcImpl();

    @Override
    public void mostrarMenu() {
        int condicion;
        do{
            System.out.println("Seleccione una opción:");
            System.out.println(TextConstants.OPCIONES_DE_MENU_REGISTRO_JUGADORES);
            condicion = IngresoPorTeclado.ingresarNumero();
            ejecutarOpciones(condicion);
        }while(condicion!=2);
    }

    private void ejecutarOpciones(int condicion){
        switch (condicion) {
            case 1:
                registrarJugadorOpc.registrarJugador();
                break;
            default:
        }
    }

}
