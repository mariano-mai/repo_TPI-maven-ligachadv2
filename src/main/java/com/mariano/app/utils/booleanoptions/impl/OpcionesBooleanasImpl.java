package com.mariano.app.utils.booleanoptions.impl;

import com.mariano.app.input.IngresoPorTeclado;
import com.mariano.app.utils.booleanoptions.OpcionesBooleanas;

public class OpcionesBooleanasImpl implements OpcionesBooleanas{

    boolean esVerdadero = false;
    int opcion;

    @Override
    public boolean siONo(String opcion1, String opcion2) {
        System.out.println("1- "+opcion1+"\n2- "+opcion2);
        opcion = IngresoPorTeclado.ingresarEnteroPositivo();
        if(opcion == 1){
            esVerdadero = true;
        }
        return esVerdadero;
    }

    

}
