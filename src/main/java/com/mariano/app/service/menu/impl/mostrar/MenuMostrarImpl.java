package com.mariano.app.service.menu.impl.mostrar;

import com.mariano.app.constants.TextConstants;
import com.mariano.app.input.IngresoPorTeclado;
import com.mariano.app.service.menu.MenuService;
import com.mariano.app.service.menu.impl.mostrar.equipo.MostrarTodosEquipos;
import com.mariano.app.service.menu.impl.mostrar.jugador.MenuMostrarJugadorImpl;

public class MenuMostrarImpl implements MenuService{

    public static MenuService menuMostrar = new MenuMostrarImpl();

    @Override
    public void mostrarMenu() {
        int condicion;
        do{
            System.out.println("Seleccione una opción:");
            System.out.println(TextConstants.OPCIONES_DE_MENU_MOSTRAR);
            condicion = IngresoPorTeclado.ingresarNumero();
            ejecutarOpciones(condicion);
        }while(condicion!=3);
    }

    private void ejecutarOpciones(int condicion){
        switch (condicion) {
            case 1:
                //mostrar jugadores
                MenuMostrarJugadorImpl.menuMostrarJug.mostrarMenu();
                break;
            case 2:
                //mostrar equipos
                MostrarTodosEquipos.mostrarTodosEq.mostrarTodos();
                break;
            default:
        }
    }

}
