package co.edu.uniquindo.patronesDiseno.FactoryMethod.Factory;

import co.edu.uniquindo.patronesDiseno.FactoryMethod.Model.TelevisorOLed;
import co.edu.uniquindo.patronesDiseno.FactoryMethod.Service.ITelevisor;
import co.edu.uniquindo.patronesDiseno.FactoryMethod.Service.ITelevisorFactory;

public class TelevisorOLedFactory implements ITelevisorFactory {
    private int tamanioPantalla;
    private boolean conectividadInternet;

    public TelevisorOLedFactory(int tamanioPantalla, boolean conectividadInternet) {
        this.tamanioPantalla = tamanioPantalla;
        this.conectividadInternet = conectividadInternet;
    }

    @Override
    public ITelevisor crearTelevisor() {
        return new TelevisorOLed(tamanioPantalla, conectividadInternet);
    }
}
