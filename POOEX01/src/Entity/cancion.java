package Entity;

public class cancion {
    private String titulo;
    private String autor;
    public cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
    public cancion() {
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
    
}
