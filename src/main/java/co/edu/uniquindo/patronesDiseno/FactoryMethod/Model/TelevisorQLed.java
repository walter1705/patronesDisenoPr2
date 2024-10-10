package co.edu.uniquindo.patronesDiseno.FactoryMethod.Model;

import co.edu.uniquindo.patronesDiseno.FactoryMethod.Service.ITelevisor;

public class TelevisorQLed implements ITelevisor {
    private int tamanioPantalla;
    private String resolucion;
    private boolean soporteHDR;

    public TelevisorQLed(int tamanioPantalla, String resolucion, boolean soporteHDR) {
        this.tamanioPantalla = tamanioPantalla;
        this.resolucion = resolucion;
        this.soporteHDR = soporteHDR;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Televisor QLED - Tamaño de Pantalla: " + tamanioPantalla + " pulgadas, Resolución: " + resolucion +
                ", Soporte HDR: " + (soporteHDR ? "Sí" : "No"));
    }
}
