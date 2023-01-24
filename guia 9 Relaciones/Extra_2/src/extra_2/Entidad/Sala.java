package extra_2.Entidad;

import java.util.*;

public class Sala {
    private String[][] sillas = {
        {"8A ", "8B ", "8C ", "8D ", "8E ", "8F "},
        {"7A ", "7B ", "7C ", "7D ", "7E ", "7F "},
        {"6A ", "6B ", "6C ", "6D ", "6E ", "6F "},
        {"5A ", "5B ", "5C ", "5D ", "5E ", "5F "},
        {"4A ", "4B ", "4C ", "4D ", "4E ", "4F "},
        {"3A ", "3B ", "3C ", "3D ", "3E ", "3F "},
        {"2A ", "2B ", "2C ", "2D ", "2E ", "2F "},
        {"1A ", "1B ", "1C ", "1D ", "1E ", "1F "}
    };
    private ArrayList<Espectador> espectadores;
    private Pelicula peli;
    private int precio;

    public Sala() {
    }

    public Sala(ArrayList<Espectador> espectadores, Pelicula peli, int precio) {
        this.espectadores = espectadores;
        this.peli = peli;
        this.precio = precio;
    }

    public String[][] getSillas() {
        return sillas;
    }

    public void setSillas(String[][] sillas) {
        this.sillas = sillas;
    }

    public ArrayList<Espectador> getEspectadores() {
        return espectadores;
    }

    public void setEspectadores(ArrayList<Espectador> espectadores) {
        this.espectadores = espectadores;
    }

    public Pelicula getPeli() {
        return peli;
    }

    public void setPeli(Pelicula peli) {
        this.peli = peli;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
}
