package ejercicio_3.Services;

import java.util.*;
import ejercicio_3.Entidad.*;

public class BarajaServicio {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Carta> cartas = new ArrayList();
    int cActual = 0;

    public void crearBaraja() {
        Baraja b = new Baraja();
        String[] palos = {"espadas", "bastos", "oro", "copas"};
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j < 13; j++) {
                if (j != 8 && j != 9) {
                    Carta c = new Carta(j, palos[i]);
                    cartas.add(c);
                }
            }
        }
        System.out.println(cartas.size());
        b.setBar(cartas);
    }

    public void barajar() {
        Collections.shuffle(cartas);
    }

    public Carta siguienteCarta() {
        Carta aux = new Carta(0,"espadas");
        if (cActual < cartas.size()) {
            System.out.println("Carta retirada");
            aux.setNum(cartas.get(cActual).getNum());
            aux.setPalo(cartas.get(cActual).getPalo());
            cartas.remove(cActual);
        } else {
            System.out.println("No hay mas cartas en la baraja");
        }
        return aux;
    }

    public void cartasDisponibles() {
        System.out.println("El numero de cartas que se pueden repartir es: " + cartas.size());
    }

    public ArrayList<Carta> darCartas() {
        System.out.println("Cuantas cartas desea sacar:");
        int car = sc.nextInt();
        ArrayList<Carta> darCarta = new ArrayList();
        for (int i = 0; i < car; i++) {
            darCarta.add(cartas.get(i));
            cartas.remove(i);
        }
        return darCarta;
    }
    
    public void cartasMonton(ArrayList<Carta> car){
        if(cartas.size() == 40){
            System.out.println("No ha salido ninguna carta");
        }else{
            for(Carta aux: car){
                System.out.println(car);
            }
        }
    }
    
    public void mostrarBaraja(){
        System.out.println("Mostrando todas las cartas restantes en la baraja");
        for(Carta aux: cartas){
            System.out.println(aux);
        }
    }
}
