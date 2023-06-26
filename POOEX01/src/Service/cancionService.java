package Service;
import Entity.cancion;
import java.util.Scanner;
public class cancionService {
    cancion cancion;
    Scanner read = new Scanner(System.in);
    public cancion guardarCancion() {
        System.out.println("Título de la canción: ");
        String titulo = read.nextLine();
        System.out.println("Autor: ");
        String autor = read.nextLine();
        cancion = new cancion(titulo, autor);
        return cancion;
    }
    public void mostrarCancion(cancion cancion) {
        System.out.println("-------CANCION---------");
        System.out.println("Título: " + cancion.getTitulo());
        System.out.println("Autor: " + cancion.getAutor());
    }
}
