package iron.man;

/**
 *
 * @author juanb
 */
class JARVIS {

    public double calcularDistancia(double x, double y, double z) {
        double distancia = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
        return distancia;
    }
}
