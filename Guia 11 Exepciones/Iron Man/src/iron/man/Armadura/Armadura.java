package iron.man.Armadura;

/**
 *
 * @author juanb
 */
public class Armadura {

    private final Bota botas;
    private final Guante guantes;
    private final Consola consola;
    private final Sintetizador sintetizador;
    private final Generador generador;

    public Armadura(Bota botas, Guante guantes, Consola consola, Sintetizador sintetizador, Generador generador) {
        this.botas = botas;
        this.guantes = guantes;
        this.consola = consola;
        this.sintetizador = sintetizador;
        this.generador = generador;
    }

    public void mostrarEstado() {
        System.out.println("Estado de la armadura:");
        System.out.println("Botas: " + this.botas.getEstado());
        System.out.println("Guantes: " + this.guantes.getEstado());
        System.out.println("Consola: " + this.consola.getEstado());
        System.out.println("Sintetizador: " + this.sintetizador.getEstado());
        System.out.println("Generador: " + this.generador.getEstado());
    }

    public void estadoDeLaBateria() {
        System.out.println("El estado de la batería es del " + this.generador.getCarga() + "%");
    }

    public void informacionDelReactor() {
        System.out.println("Nivel de carga del reactor: " + this.generador.getCarga() + "%");
        System.out.println("Cantidad de energía producida: " + this.generador.getCarga() * 1000 + " Watts");
    }

    public void revisarDispositivos() {
        System.out.println("Revisando dispositivos...");
        if ("Dañado".equals(this.botas.getEstado())) {
            System.out.println("Las botas están dañadas.");
        }
        if ("Dañado".equals(this.guantes.getEstado())) {
            System.out.println("Los guantes están dañados.");
        }
        if ("Dañado".equals(this.consola.getEstado())) {
            System.out.println("La consola está dañada.");
        }
        if ("Dañado".equals(this.sintetizador.getEstado())) {
            System.out.println("El sintetizador está dañado.");
        }
        if ("Dañado".equals(this.generador.getEstado())) {
            System.out.println("El generador está dañado.");
        }
    }

    public void repararDaños() {
        System.out.println("Intentando reparar los dispositivos dañados...");
        this.botas.reparar();
        this.guantes.reparar();
        this.consola.reparar();
        this.sintetizador.reparar();
        this.generador.reparar();
    }

    public void accionesEvasivas() {
        if (this.generador.getCarga() < 10) {
            System.out.println("Cortando ataques y huyendo...");
        }
    }


}













