package extra_1.Entidad;

public class Perro {
    private String nombre,tamaño,raza;
    private int edad;
    private boolean adopt;

    public Perro() {
    }

    public Perro(String nombre, String tamaño, String raza, int edad, boolean adopt) {
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.edad = edad;
        this.edad = edad;
        this.adopt = adopt;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean getAdopt(){
        return adopt;
    }
    
    public void setAdopt(boolean adopt){
        this.adopt = adopt;
    }
    
    @Override
    public String toString() {
        return nombre + " Es de raza: " + raza + " es: " + tamaño + " y tiene: " + edad + " años y" + adoptS();
    }
    
    public String adoptS(){
        if (adopt) {
            return " El perro esta adoptado";
        }else{
            return " El perro no esta adoptado";
        }     
    }
    
}
