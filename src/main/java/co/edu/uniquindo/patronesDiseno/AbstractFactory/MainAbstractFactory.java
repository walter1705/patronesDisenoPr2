package co.edu.uniquindo.patronesDiseno.AbstractFactory;

import co.edu.uniquindo.patronesDiseno.AbstractFactory.Factory.SamsungFactory;
import co.edu.uniquindo.patronesDiseno.AbstractFactory.Model.*;
import co.edu.uniquindo.patronesDiseno.AbstractFactory.Service.IAbstractFactory;

public class MainAbstractFactory {
    public static void main(String[] args) {
        //En este programa, vamos a simular la gestión de diferentes familias de productos en la empresa Samsung.
        // Los productos que se manejarán incluyen televisores:  tamaño y resolución, celular:
        // procesador y numero de cámaras, lavadora: capacidad en kilogramos y color, equipo de sonido:
        // color y tamaño, cada uno con sus atributos específicos y comportamientos. Se implementara el
        // patrón creacional  Abstract Factory que  permite crear objetos relacionados sin especificar
        // sus clases concretas.

        IAbstractFactory samsungFactory = new SamsungFactory();

        Televisor tvSamsung = samsungFactory.crearTelevisor("65 pulgadas", "4K");
        Celular celularSamsung = samsungFactory.crearCelular("Exynos 2200", 4);
        Lavadora lavadoraSamsung = samsungFactory.crearLavadora(18, "Blanco");
        EquipoSonido equipoSonidoSamsung = samsungFactory.crearEquipoSonido("Negro", "Grande");

        System.out.println("Detalles de los productos Samsung:");
        tvSamsung.mostrarInformacion();
        celularSamsung.mostrarInformacion();
        lavadoraSamsung.mostrarInformacion();
        equipoSonidoSamsung.mostrarInformacion();
    }


}
