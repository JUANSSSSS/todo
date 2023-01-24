package extra_2.Entidad;

public class Pelicula {
    private String titulo,autor;
    private int duracion,edadMin;

    public Pelicula() {
    }

    public Pelicula(String titulo, String autor, int duracion, int edadMin) {
        this.titulo = titulo;
        this.autor = autor;
        this.duracion = duracion;
        this.edadMin = edadMin;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getEdadMin() {
        return edadMin;
    }

    public void setEdadMin(int edadMin) {
        this.edadMin = edadMin;
    }

    @Override
    public String toString() {
        return titulo + " dirigida por: " + autor + " dura: " + duracion + " minutos y la edad minima pra verla es: " + edadMin;
    }
    
}
