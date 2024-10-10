package co.edu.uniquindo.patronesDiseno.FactoryMethod.Factory;

import co.edu.uniquindo.patronesDiseno.FactoryMethod.Model.TelevisorQLed;
import co.edu.uniquindo.patronesDiseno.FactoryMethod.Service.ITelevisor;
import co.edu.uniquindo.patronesDiseno.FactoryMethod.Service.ITelevisorFactory;

public class TelevisorQLedFactory implements ITelevisorFactory {
    private int tamanioPantalla;
    private String resolucion;
    private boolean soporteHDR;

    public TelevisorQLedFactory(int tamanioPantalla, String resolucion, boolean soporteHDR) {
        this.tamanioPantalla = tamanioPantalla;
        this.resolucion = resolucion;
        this.soporteHDR = soporteHDR;
    }

    @Override
    public ITelevisor crearTelevisor() {
        return new TelevisorQLed(tamanioPantalla, resolucion, soporteHDR);
    }
}
