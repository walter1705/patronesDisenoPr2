package co.edu.uniquindo.patronesDiseno.Prototype;

import co.edu.uniquindo.patronesDiseno.Prototype.Factory.VasoFactory;
import co.edu.uniquindo.patronesDiseno.Prototype.Model.Vaso;

public class MainPrototype {
    public static void main(String[] args) {
        // Crear un vaso prototipo
        Vaso vasoPrototype = new Vaso("Uwu", 500, "Blanco", "Grande");

        // Crear la fábrica usando el vaso prototipo
        VasoFactory factory = new VasoFactory(vasoPrototype);

        // Producir 555 vasos idénticos
        Vaso[] vasosProducidos = factory.producirVasos(555);

        // Mostrar detalles de los vasos producidos
        for (int i = 0; i < vasosProducidos.length; i++) {
            System.out.println("Vaso #" + (i + 1) + ":");
            vasosProducidos[i].toString();
            System.out.println("----------------------");
        }
    }
}
