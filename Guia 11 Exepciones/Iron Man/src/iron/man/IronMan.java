package iron.man;

import iron.man.Armadura.Armadura;
import iron.man.Armadura.Bota;
import iron.man.Armadura.Consola;
import iron.man.Armadura.Generador;
import iron.man.Armadura.Guante;
import iron.man.Armadura.Sintetizador;

/**
 *
 * @author juanb
 */
public class IronMan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bota botas = new Bota(5, 10, 2);
        Guante guantes = new Guante(3);
        Consola consola = new Consola(4);
        Sintetizador sintetizador = new Sintetizador(2);
        Generador generador = new Generador(100);
        Armadura armadura = new Armadura(botas, guantes, consola, sintetizador, generador);

        armadura.mostrarEstado();

        armadura.estadoDeLaBateria();

        armadura.informacionDelReactor();

        armadura.revisarDispositivos();

        armadura.repararDaños();

        armadura.accionesEvasivas();
        
        JARVIS jarvis = new JARVIS();
        double x = 5.0;
        double y = 10.0;
        double z = 15.0;
        double distancia = jarvis.calcularDistancia(x, y, z);

        System.out.println("La distancia al objetivo es: " + distancia);

        Radar[] radarObjects = new Radar[10];

        for (int i = 0; i < radarObjects.length; i++) {
            radarObjects[i] = new Radar();
        }

        for (int i = 0; i < radarObjects.length; i++) {
            System.out.println("Object " + (i + 1) + ": ");
            System.out.println("  Resistencia: " + radarObjects[i].getResistance());
            System.out.println("  Coordenadas: " + radarObjects[i].getCoordinates());
            System.out.println("  Hostilidad: " + radarObjects[i].getHostility());
        }

    }

}
