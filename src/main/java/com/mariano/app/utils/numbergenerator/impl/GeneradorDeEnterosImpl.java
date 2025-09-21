package com.mariano.app.utils.numbergenerator.impl;

import com.mariano.app.utils.numbergenerator.GeneradorDeEnteros;

public class GeneradorDeEnterosImpl implements GeneradorDeEnteros{

    @Override
    public int numeroEnteroAlAzar(int min, int max) {
        return (int)(Math.random()*(max-min)+min);
    }

}
