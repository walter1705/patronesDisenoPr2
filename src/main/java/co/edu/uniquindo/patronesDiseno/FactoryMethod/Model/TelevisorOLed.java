package co.edu.uniquindo.patronesDiseno.FactoryMethod.Model;

import co.edu.uniquindo.patronesDiseno.FactoryMethod.Service.ITelevisor;

public class TelevisorOLed implements ITelevisor {
    private int tamanioPantalla;
    private boolean conectividadInternet;

    public TelevisorOLed(int tamanioPantalla, boolean conectividadInternet) {
        this.tamanioPantalla = tamanioPantalla;
        this.conectividadInternet = conectividadInternet;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Televisor OLED - Tamaño de Pantalla: " + tamanioPantalla + " pulgadas, Conectividad a Internet: " +
                (conectividadInternet ? "Sí" : "No"));
    }
}
