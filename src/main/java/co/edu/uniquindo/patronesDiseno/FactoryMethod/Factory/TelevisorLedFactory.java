package co.edu.uniquindo.patronesDiseno.FactoryMethod.Factory;

import co.edu.uniquindo.patronesDiseno.FactoryMethod.Model.TelevisorLed;
import co.edu.uniquindo.patronesDiseno.FactoryMethod.Service.ITelevisor;
import co.edu.uniquindo.patronesDiseno.FactoryMethod.Service.ITelevisorFactory;

public class TelevisorLedFactory implements ITelevisorFactory {
    private int tamanioPantalla;
    private String resolucion;

    public TelevisorLedFactory(int tamanioPantalla, String resolucion) {
        this.tamanioPantalla = tamanioPantalla;
        this.resolucion = resolucion;
    }

    @Override
    public ITelevisor crearTelevisor() {
        return new TelevisorLed(tamanioPantalla, resolucion);
    }
}
