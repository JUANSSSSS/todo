package ejercicio_3.Entidad;

import java.util.*;

public class Baraja {
    private ArrayList<Carta> bar = new ArrayList();

    public Baraja() {
    }

    public ArrayList<Carta> getBar() {
        return bar;
    }

    public void setBar(ArrayList<Carta> bar) {
        this.bar = bar;
    }

    @Override
    public String toString() {
        return bar +"";
    }
    
}
