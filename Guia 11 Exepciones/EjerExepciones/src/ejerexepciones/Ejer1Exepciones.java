
package ejerexepciones;

/**
 *
 * @author juanb
 */
public class Ejer1Exepciones {

    
    public static void main(String[] args) {
        int porDebajo = 0;
    int pesoIdeal = 0;
    int sobrePeso = 0;
    int mayores = 0;

    Persona p1 = new Persona();
    p1.crearPersona();

    Persona p2 = new Persona();
    p2.crearPersona();

    Persona p3 = new Persona();
    p3.crearPersona();

    Persona p4 = new Persona();
    p4.crearPersona();


    if(p1.calcularIMC() == -1){
        porDebajo++;
    }else if(p1.calcularIMC() == 0){
        pesoIdeal++;
    }else{
        sobrePeso++;
    }

    if(p2.calcularIMC() == -1){
        porDebajo++;
    }else if(p2.calcularIMC() == 0){
        pesoIdeal++;
    }else{
        sobrePeso++;
    }

    if(p3.calcularIMC() == -1){
        porDebajo++;
    }else if(p3.calcularIMC() == 0){
        pesoIdeal++;
    }else{
        sobrePeso++;
    }

    if(p4.calcularIMC() == -1){
        porDebajo++;
    }else if(p4.calcularIMC() == 0){
        pesoIdeal++;
    }else{
        sobrePeso++;
    }

    if(p1.esMayorDeEdad()){
        mayores++;
    }
    if(p2.esMayorDeEdad()){
        mayores++;
    }
    if(p3.esMayorDeEdad()){
        mayores++;
    }
    if(p4.esMayorDeEdad()){
        mayores++;
    }

    System.out.println("Porcentaje de personas por debajo de su peso: " + (porDebajo*100)/4);
    System.out.println("Porcentaje de personas que tienen su peso ideal: " + (pesoIdeal*100)/4);
    System.out.println("Porcentaje de personas con sobrepeso: " + (sobrePeso*100)/4);
    System.out.println("Porcentaje de personas mayores de edad: " + (mayores*100)/4);

    Persona p5 = null;

    try{
        p5.esMayorDeEdad();
    }catch (Exception e){
        System.out.println("No se puede invocar el método a un objeto nulo");
    }

    }
}