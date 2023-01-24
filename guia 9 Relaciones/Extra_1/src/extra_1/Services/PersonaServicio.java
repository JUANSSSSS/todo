package extra_1.Services;

import java.util.*;
import extra_1.Entidad.*;

public class PersonaServicio {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    String op;
    ArrayList<Perro> perros = new ArrayList();
    ArrayList<Persona> personas = new ArrayList();

    private void crearPerros() {
        do {
            System.out.println("------::Creando Perro Nuevo::-----");
            Perro auxP = new Perro();
            System.out.print("Ingrese el nombre del perro: ");
            auxP.setNombre(sc.next());
            System.out.print("Ingrese la raza del perro: ");
            auxP.setRaza(sc.next());
            System.out.print("Ingrese la edad del perro: ");
            auxP.setEdad(sc.nextInt());
            System.out.print("Ingrese el tamaño del perro: ");
            auxP.setTamaño(sc.next());
            auxP.setAdopt(false);
            System.out.println("Perro creado: " + auxP);
            perros.add(auxP);

            System.out.println("Desea crear otro perro? (S/N)");
            op = sc.next();
        } while (op.equalsIgnoreCase("s"));
        System.out.println("---:Perros ingresados:---");
        crearPersona();
    }

    private void crearPersona() {
        do {
            System.out.println("-----::Creando Persona Nueva::-----");
            Persona aux = new Persona();
            System.out.print("Ingrese el nombre de la persona: ");
            aux.setNombre(sc.next());
            System.out.print("Ingrese el apellido de la persona: ");
            aux.setApellido(sc.next());
            System.out.print("Ingrese la edad de la persona: ");
            aux.setEdad(sc.nextInt());
            System.out.print("Ingrese el DNI de la persona: ");
            aux.setDNI(sc.nextLong());
            System.out.println("Persona creada: " + aux);
            personas.add(aux);
            System.out.println("Desea Crear otra Persona? (S/N)");
            op = sc.next();
        } while (op.equalsIgnoreCase("s"));
        System.out.println("---:Personas Ingresadas:---");
    }

    private void asignarPerros() {
        ArrayList<Persona> auxList = new ArrayList();
        System.out.println("Lista de perros para adoptar");
        int cont = 0;
        for (Perro auxP : perros) {
            if (auxP.getAdopt() == false) {
                cont++;
                System.out.println(auxP);
            }
        }
        System.out.println("--------::::--------");
        System.out.println("  Adoptando perros");
        for (int i = 0; i < personas.size(); i++) {
            op = "n";
            Persona aux = personas.get(i);
            System.out.println(aux.getNombre() + " Ingresa el nombre del perro deseado: ");
            String nombre = sc.next();
            for (int j = 0; j < perros.size(); j++) {
                if (perros.get(j).getNombre().equalsIgnoreCase(nombre) && perros.get(j).getAdopt() == false) {
                    perros.get(i).setAdopt(true);
                    aux.setDogo(perros.get(i));
                    System.out.println("Perro Adoptado por: " + aux.getNombre() + " Correctamente");
                    cont = cont - 1;
                } else if (perros.get(j).getNombre().equalsIgnoreCase(nombre) && perros.get(j).getAdopt() == true) {
                    System.out.println("El perro ingresado esta adoptado");
                    System.out.println("Desea Probar con otro perro?(S/N)");
                    op = sc.next();
                }
            }
            auxList.add(aux);
            if (op.equalsIgnoreCase("s") && cont > 0) {
                System.out.println("Mostrando Perros en adopcion");
                for (Perro auxP : perros) {
                    if (auxP.getAdopt() == false) {
                        System.out.println(auxP);
                    }
                }
                auxList.remove(i);
                i = i - 1;
            }
            System.out.println("................");
        }
        personas.clear();
        personas.addAll(auxList);
    }

    private void mostrarPersonas() {
        System.out.println("----:::Mostrando Personas:::---");
        for (Persona aux : personas) {
            System.out.println(aux);
        }
    }

    public void menu() {
        crearPerros();
        asignarPerros();
        mostrarPersonas();
    }
}
