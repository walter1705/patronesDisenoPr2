package co.edu.uniquindo.patronesDiseno.FactoryMethod.Model;

import co.edu.uniquindo.patronesDiseno.FactoryMethod.Service.ITelevisor;

public class TelevisorLed implements ITelevisor {
    private int tamanioPantalla;
    private String resolucion;

    public TelevisorLed(int tamanioPantalla, String resolucion) {
        this.tamanioPantalla = tamanioPantalla;
        this.resolucion = resolucion;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Televisor LED - Tamaño de Pantalla: " + tamanioPantalla + " pulgadas, Resolución: " + resolucion);
    }
}
