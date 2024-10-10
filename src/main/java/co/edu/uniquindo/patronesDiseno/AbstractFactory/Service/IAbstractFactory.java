package co.edu.uniquindo.patronesDiseno.AbstractFactory.Service;

import co.edu.uniquindo.patronesDiseno.AbstractFactory.Model.Celular;
import co.edu.uniquindo.patronesDiseno.AbstractFactory.Model.EquipoSonido;
import co.edu.uniquindo.patronesDiseno.AbstractFactory.Model.Lavadora;
import co.edu.uniquindo.patronesDiseno.AbstractFactory.Model.Televisor;

public interface IAbstractFactory {
    Televisor crearTelevisor(String tamano, String resolucion);
    Celular crearCelular(String procesador, int numCamaras);
    Lavadora crearLavadora(int capacidadKg, String color);
    EquipoSonido crearEquipoSonido(String color, String tamano);
}
