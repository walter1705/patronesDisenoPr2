package co.edu.uniquindo.patronesDiseno.Prototype.Factory;

import co.edu.uniquindo.patronesDiseno.Prototype.Model.Vaso;

public class VasoFactory {
    private Vaso prototipoVaso;

    public VasoFactory(Vaso prototipoVaso) {
        this.prototipoVaso = prototipoVaso;
    }

    // Method para producir una cantidad específica de vasos idénticos
    public Vaso[] producirVasos(int cantidad) {
        Vaso[] vasos = new Vaso[cantidad];
        for (int i = 0; i < cantidad; i++) {
            vasos[i] = prototipoVaso.clone();
        }
        return vasos;
    }
}

