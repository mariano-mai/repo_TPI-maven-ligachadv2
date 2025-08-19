package com.mariano.app.service.menu.impl.registro.jugador.opciones;

import com.mariano.app.input.IngresoPorTeclado;
import com.mariano.app.service.jugador.JugadorService;
import com.mariano.app.service.jugador.impl.JugadorServiceImpl;
import com.mariano.app.utils.textgenerator.impl.GeneradorDeTextoImpl;

public class RegistrarJugadorOpc {

    public static RegistrarJugadorOpc registrarJugOpc = new RegistrarJugadorOpc();

    private JugadorService jugadorService = new JugadorServiceImpl();

    public void registrarJugador(){
        System.out.println("Ingrese nombre del Jugador");
                String nombre = IngresoPorTeclado.ingresarTexto();
                System.out.println("Ingrese apellido del Jugador");
                String apellido = IngresoPorTeclado.ingresarTexto();
                System.out.println("Ingrese edad del Jugador");
                int edad = IngresoPorTeclado.ingresarNumero();
                jugadorService.crearJugador(GeneradorDeTextoImpl.generadorDeTexto.generarNombre(nombre, apellido),edad);
                System.out.println("Jugador ingresado con éxito.");
    }

}
