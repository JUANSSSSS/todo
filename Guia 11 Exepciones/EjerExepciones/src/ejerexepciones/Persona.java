
package ejerexepciones;

import java.util.Scanner;

/**
 *
 * @author juanb
 */
class Persona {
    //Atributos
    private String nombre;
    private int edad;
    private char sexo;
    private float peso;
    private float altura;

    //Constructor por defecto
    public Persona(){

    }

    //Constructor con todos los atributos como parámetro
    public Persona(String nombre, int edad, char sexo, float peso, float altura){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    //Métodos getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    //Método crearPersona
    public void crearPersona(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el nombre de la persona");
        this.nombre = sc.nextLine();

        System.out.println("Introduce la edad de la persona");
        this.edad = sc.nextInt();

        System.out.println("Introduce el sexo de la persona H, M o O");
        this.sexo = sc.next().charAt(0);

        if(this.sexo != 'H' && this.sexo != 'M' && this.sexo != 'O'){
            System.out.println("Sexo invalido");
            System.exit(0);
        }

        System.out.println("Introduce el peso de la persona");
        this.peso = sc.nextFloat();

        System.out.println("Introduce la altura de la persona");
        this.altura = sc.nextFloat();
    }

    //Método calcularIMC
    public int calcularIMC(){

        float resultado = this.peso/(float)(Math.pow(this.altura, 2));

        if(resultado < 20){
            return -1;
        }else if(resultado >= 20 && resultado <= 25){
            return 0;
        }else{
            return 1;
        }
    }

    //Método esMayorDeEdad
    public boolean esMayorDeEdad(){

        if(this.edad >= 18){
            return true;
        }else{
            return false;
        }
    }

}
