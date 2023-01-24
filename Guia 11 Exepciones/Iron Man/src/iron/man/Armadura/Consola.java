
package iron.man.Armadura;

/**
 *
 * @author juanb
 */
public class Consola {

    private int consumo;

    public Consola(int consumo) {
        this.consumo = consumo;
    }

    public int usar(int nivelIntensidad, int tiempo) {
        return this.consumo * tiempo;
    }

    public String getEstado() {
        if (this.consumo > 0) {
            return "Operativo";
        } else {
            return "Dañado";
        }
    }

    public void reparar() {
        this.consumo = 1;
    }
}