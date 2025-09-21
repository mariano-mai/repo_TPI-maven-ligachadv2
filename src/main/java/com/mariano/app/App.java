package com.mariano.app;

import com.mariano.app.repository.bootstrapdata.impl.BootstrapDataImpl;
import com.mariano.app.utils.execution.EjecutarPrograma;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        BootstrapDataImpl.bootstrap.crearEquipos();
        EjecutarPrograma.ejecutar.ejecutar();
    }
}
