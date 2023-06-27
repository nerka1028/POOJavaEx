package Entity;
import java.util.Date;

public class Pelicula {
    private String titulo;
    private String genero;
    private Date año;
    private int duracion;
    public Pelicula(String titulo, String genero, Date año, int duracion) {
        this.titulo = titulo;
        this.genero = genero;
        this.año = año;
        this.duracion = duracion;
    }
    public Pelicula() {
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public Date getAño() {
        return año;
    }
    public void setAño(Date año) {
        this.año = año;
    }
    public int getDuracion() {
        return duracion;
    }
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
}
