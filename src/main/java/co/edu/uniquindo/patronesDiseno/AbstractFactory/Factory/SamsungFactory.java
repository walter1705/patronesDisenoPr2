package co.edu.uniquindo.patronesDiseno.AbstractFactory.Factory;

import co.edu.uniquindo.patronesDiseno.AbstractFactory.Model.Celular;
import co.edu.uniquindo.patronesDiseno.AbstractFactory.Model.EquipoSonido;
import co.edu.uniquindo.patronesDiseno.AbstractFactory.Model.Lavadora;
import co.edu.uniquindo.patronesDiseno.AbstractFactory.Model.Televisor;
import co.edu.uniquindo.patronesDiseno.AbstractFactory.Service.IAbstractFactory;

public class SamsungFactory implements IAbstractFactory {

    @Override
    public Televisor crearTelevisor(String tamano, String resolucion) {
        return new Televisor(tamano, resolucion);
    }

    @Override
    public Celular crearCelular(String procesador, int numCamaras) {
        return new Celular(procesador, numCamaras);
    }

    @Override
    public Lavadora crearLavadora(int capacidadKg, String color) {
        return new Lavadora(capacidadKg, color);
    }

    @Override
    public EquipoSonido crearEquipoSonido(String color, String tamano) {
        return new EquipoSonido(color, tamano);
    }
}
