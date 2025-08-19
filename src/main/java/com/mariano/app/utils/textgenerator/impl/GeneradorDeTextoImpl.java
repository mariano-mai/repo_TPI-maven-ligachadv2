package com.mariano.app.utils.textgenerator.impl;

import com.mariano.app.utils.textgenerator.GeneradorDeTexto;

public class GeneradorDeTextoImpl implements GeneradorDeTexto{

    public static GeneradorDeTexto generadorDeTexto = new GeneradorDeTextoImpl();

    @Override
    public String generarNombre(String nombre, String apellido) {
        return apellido+", "+nombre;
    }

}
