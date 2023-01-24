
package iron.man.Armadura;

/**
 *
 * @author juanb
 */
public class Generador {

    private final int cargaMaxima;
    private int cargaActual;

    public Generador(int cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
        this.cargaActual = cargaMaxima;
    }

    public void cargar(int carga) {
        this.cargaActual += carga;
    }

    public void descargar(int carga) {
        this.cargaActual -= carga;
    }

    public int getCarga() {
        return this.cargaActual;
    }

    public String getEstado() {
        if (this.cargaActual > 0) {
            return "Operativo";
        } else {
            return "Dañado";
        }
    }

    public void reparar() {
        this.cargaActual = this.cargaMaxima;
    }
}
