package com.mariano.app.utils.execution;

import com.mariano.app.service.menu.impl.principal.MenuPrincipalImpl;

public class EjecutarPrograma {

    public static EjecutarPrograma ejecutar = new EjecutarPrograma();

    public void ejecutar(){
        MenuPrincipalImpl.menuPrincipal.mostrarMenu();
    }

}
