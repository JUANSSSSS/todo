package ejercicio_1.Services;

import ejercicio_1.Entidad.*;
import java.util.*;

public class PersonaServicio {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    String op, nombre, apellido, raza, size;
    int edad,cont = 0;
    long dni;
    ArrayList<Perro> perros = new ArrayList();
    ArrayList<Persona> personas = new ArrayList();

    public void crearPerros() {
        do {
            System.out.println("------------------------------------");
            System.out.println("Ingrese el nombre del perro");
            nombre = sc.next();
            System.out.println("Ingrese la raza del perro");
            raza = sc.next();
            System.out.println("Ingrese la edad del perro");
            edad = sc.nextInt();
            System.out.println("Ingrese el tamaño del perro");
            size = sc.next();
            Perro p = new Perro(nombre, raza, edad, size);
            System.out.println("Perro creado: " + p);
            perros.add(p);
            System.out.println("------------------------------------");
            System.out.println("Desea seguir ingresando perros?(S/N)");
            op = sc.next();
        } while (op.equalsIgnoreCase("S"));
        crearPersona();
    }

    public void crearPersona() {
        Iterator it = perros.iterator();
        while (it.hasNext()) {
            System.out.println("--------------------------------------");
            System.out.println("Creando persona a partir del perro #" + (cont+1));
            System.out.println("Ingrese el nombre de la persona");
            nombre = sc.next();
            System.out.println("Ingrese el apellido de la persona");
            apellido = sc.next();
            System.out.println("Ingrese el DNI de la persona");
            dni = sc.nextLong();
            System.out.println("Ingrese la edad de la persona");
            edad = sc.nextInt();
            Persona p1 = new Persona(nombre,apellido,edad, perros.get(cont),dni);
            System.out.println("Persona creada: \n" + p1);
            personas.add(p1);
            cont++;
        }
    }
    public void mostrarPersonas(){
        for(Persona per:personas){
            System.out.println(per);
        }
    }
    
    public void menu(){
        crearPerros();
        mostrarPersonas();
    }
}
