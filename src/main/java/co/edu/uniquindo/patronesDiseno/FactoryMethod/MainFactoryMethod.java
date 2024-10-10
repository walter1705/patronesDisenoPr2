package co.edu.uniquindo.patronesDiseno.FactoryMethod;
import co.edu.uniquindo.patronesDiseno.FactoryMethod.Factory.TelevisorLedFactory;
import co.edu.uniquindo.patronesDiseno.FactoryMethod.Factory.TelevisorOLedFactory;
import co.edu.uniquindo.patronesDiseno.FactoryMethod.Factory.TelevisorQLedFactory;
import co.edu.uniquindo.patronesDiseno.FactoryMethod.Service.ITelevisor;
import co.edu.uniquindo.patronesDiseno.FactoryMethod.Service.ITelevisorFactory;

public class MainFactoryMethod {
    public static void main(String[] args) {
        //Una empresa que fabrica televisores ofrece distintos tipos de
        //televisores: TelevisorLED, TelevisorOLED, y TelevisorQLED.
        //Cada tipo de televisor tiene características como tamaño de
        //pantalla, resolución y conectividad (por ejemplo, si es
        //compatible con internet).
        //
        //El problema radica en que el código actual crea instancias
        //de estos televisores directamente, lo que dificulta la
        //mantenibilidad. Además, se planea lanzar nuevos tipos de
        //televisores en el futuro, lo cual implicaría modificar el
        //código existente si no se aplica un buen patrón de diseño.


        ITelevisorFactory televisorLedFactory = new TelevisorLedFactory(55, "4K");
        ITelevisor televisorLed = televisorLedFactory.crearTelevisor();
        televisorLed.mostrarDetalles();


        ITelevisorFactory televisorOLedFactory = new TelevisorOLedFactory(65, true);
        ITelevisor televisorOLed = televisorOLedFactory.crearTelevisor();
        televisorOLed.mostrarDetalles();

        ITelevisorFactory televisorQLedFactory = new TelevisorQLedFactory(75, "8K", true);
        ITelevisor televisorQLed = televisorQLedFactory.crearTelevisor();
        televisorQLed.mostrarDetalles();
    }
}