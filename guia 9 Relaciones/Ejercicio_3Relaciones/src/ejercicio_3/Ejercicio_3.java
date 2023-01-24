package ejercicio_3;

import ejercicio_3.Entidad.Carta;
import ejercicio_3.Services.BarajaServicio;
import java.util.*;

public class Ejercicio_3 {

    public static void main(String[] args) {
        BarajaServicio baraja = new BarajaServicio();
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Carta> cartasUser = new ArrayList();
        int op;
        
        baraja.crearBaraja();
        do{
            System.out.print(""
                    + "-------::Menu::-------\n"
                    + "----------------------\n"
                    + "1.Barajar Cartas\n"
                    + "2.Sacar Una Carta\n"
                    + "3.Cartas Disponibles\n"
                    + "4.Sacar Varias Cartas\n"
                    + "5.Cartas Fuera de la Baraja\n"
                    + "6.Mostrar Baraja\n"
                    + "7.salir\n"
                    + "Elije una opcion:");
                    op = sc.nextInt();
            System.out.println(""
                    + "----------------------");
            switch(op){
                case 1:
                    baraja.barajar();
                    break;
                case 2:
                    cartasUser.add(baraja.siguienteCarta());
                    break;
                case 3:
                    baraja.cartasDisponibles();
                    break;
                case 4:
                    ArrayList<Carta> aux = baraja.darCartas();
                    for (int i = 0; i < aux.size(); i++) {
                        cartasUser.add(aux.get(i));
                    }
                    break;
                case 5:
                    baraja.cartasMonton(cartasUser);
                    break;
                case 6:
                    baraja.mostrarBaraja();
                    break;
                case 7:
                    System.out.println("---:Saliendo:---");
                    break;
                default:
                    System.out.println("Numero ingresado no Reconocido");
            }
        }while(op != 7);
    }
    
}
