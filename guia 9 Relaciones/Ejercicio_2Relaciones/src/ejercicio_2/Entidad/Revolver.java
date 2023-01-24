package ejercicio_2.Entidad;

public class Revolver {
    private int posicionDeDisparo;
    private int posicionDeAgua;

    public Revolver() {
    }

    public Revolver(int posicionDeDisparo, int posicionDeAgua) {
        this.posicionDeDisparo = posicionDeDisparo;
        this.posicionDeAgua = posicionDeAgua;
    }
 
    public int getPosicionDeDisparo() {
        return posicionDeDisparo;
    }

    public void setPosicionDeDisparo(int posicionDeDisparo) {
        this.posicionDeDisparo = posicionDeDisparo;
    }

    public int getPosicionDeAgua() {
        return posicionDeAgua;
    }

    public void setPosicionDeAgua(int posicionDeAgua) {
        this.posicionDeAgua = posicionDeAgua;
    }

    @Override
    public String toString() {
        return "Posicion actual de el revolver: " + posicionDeDisparo + ", El agua se encuentra en la posicion: " + posicionDeAgua;
    }
}
