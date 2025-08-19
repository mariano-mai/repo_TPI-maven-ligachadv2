package com.mariano.app.service.menu.impl.mostrar.jugador;

import com.mariano.app.constants.TextConstants;
import com.mariano.app.input.IngresoPorTeclado;
import com.mariano.app.service.menu.MenuService;
import com.mariano.app.service.menu.impl.mostrar.jugador.opciones.MostrarTodosJugadoresOpc;

public class MenuMostrarJugadorImpl implements MenuService{

    public static MenuService menuMostrarJug = new MenuMostrarJugadorImpl();

    @Override
    public void mostrarMenu() {
        int condicion;
        do{
            System.out.println("Seleccione una opción: ");
            System.out.println(TextConstants.OPCIONES_DE_MENU_MOSTRAR_JUGADORES);
            condicion = IngresoPorTeclado.ingresarEnteroPositivo();
            ejecutarOpciones(condicion);
        }while(condicion!=4);
    }

    private void ejecutarOpciones(int condicion){
        switch (condicion) {
            case 1:
                //ver todos los jugadores
                MostrarTodosJugadoresOpc.mostrarTodos.mostrarTodos();
                break;
            case 2:
                //ver titulares
                break;
            case 3:
                //ver suplentes
                break;
            default:
        }
    }

}
