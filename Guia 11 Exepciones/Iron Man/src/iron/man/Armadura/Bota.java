
package iron.man.Armadura;

/**
 *
 * @author juanb
 */
public class Bota {

    private int nivelIntensidad;
    private int tiempo;
    private int consumo;

    public Bota(int nivelIntensidad, int tiempo, int consumo) {
        this.nivelIntensidad = nivelIntensidad;
        this.tiempo = tiempo;
        this.consumo = consumo;
    }

    public int usar(int nivelIntensidad, int tiempo) {
        this.nivelIntensidad = nivelIntensidad;
        this.tiempo = tiempo;
        return this.consumo * this.tiempo;
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