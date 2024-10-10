package co.edu.uniquindo.patronesDiseno.Prototype;

import co.edu.uniquindo.patronesDiseno.Prototype.Factory.VasoFactory;
import co.edu.uniquindo.patronesDiseno.Prototype.Model.Vaso;

public class MainPrototype {
    public static void main(String[] args) {

        //En este programa, vamos a simular un sistema de producción de vasos de papel en una fábrica. La fábrica se
        // encarga de producir vasos de diferentes tamaños y colores, con opciones personalizadas para incluir logotipos
        // o mensajes impresos en los vasos, además de tener en cuenta su capacidad en mililitros. El programa de Java
        // será capaz de gestionar el proceso de creación de estos vasos, desde el diseño hasta la producción final.
        // Se implementará el patrón creacional Prototype ya que diseñaremos 10000 de vasos iguales de una forma rápida
        // y optima.


        Vaso vasoPrototype = new Vaso("Uwu", 500, "Blanco", "Grande");


        VasoFactory factory = new VasoFactory(vasoPrototype);


        Vaso[] vasosProducidos = factory.producirVasos(555);


        for (int i = 0; i < vasosProducidos.length; i++) {
            System.out.println("Vaso #" + (i + 1) + ":");
            System.out.println(vasosProducidos[i].toString());
            System.out.println("----------------------");
        }
    }
}
