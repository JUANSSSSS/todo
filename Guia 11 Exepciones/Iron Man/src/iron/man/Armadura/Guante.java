
package iron.man.Armadura;

/**
 *
 * @author juanb
 */
public class Guante {

    private int consumo;

    public Guante(int consumo) {
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
