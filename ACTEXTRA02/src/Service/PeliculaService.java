package Service;
import Entity.Pelicula;
import java.util.Scanner;
import java.util.Date;
public class PeliculaService {
    Scanner leer = new Scanner(System.in);
    public Pelicula crearPelicula() {
        System.out.println("Título: ");
        String titulo = leer.nextLine();
        System.out.println("Género: ");
        String genero = leer.nextLine();
        System.out.println("Año: ");
        int year = leer.nextInt();
        System.out.println("Mes: ");
        int mes = leer.nextInt();
        System.out.println("Día: ");
        int dia = leer.nextInt();
        System.out.println("Duración (minutos): ");
        int duracion = leer.nextInt();
        Date año = new Date(year, mes, dia);
        Pelicula pelicula = new Pelicula(titulo, genero, año, duracion);
        return pelicula;
    }
    public Pelicula[] cargarPeliculas() {
        System.out.println("Cantidad de películas: ");
        int cantidadPeliculas = leer.nextInt();
        Pelicula[] listaPeliculas = new Pelicula[cantidadPeliculas];
        for (int i = 0; i < listaPeliculas.length; i++) {
            listaPeliculas[i] = crearPelicula() ;
        }
        return listaPeliculas;
    }
    public void listaPeliculas(Pelicula[] listPeliculas) {
        for (int i = 0; i < listPeliculas.length; i++) {
            System.out.println("Película " + i + ":" + listPeliculas[i].getTitulo());
        }
    }
    public void buscarPeliculaTitulo(Pelicula[] listPeliculas) {
        System.out.println("Título de la película a buscar: ");
        String titulo = leer.nextLine();
        boolean encontrado = false;
        for (int i = 0; i < listPeliculas.length; i++) {
            if(listPeliculas[i].getTitulo().equalsIgnoreCase(titulo)){
                encontrado = true;
                break;
            }
        }
        if(encontrado){
            System.out.println("La película existe.");
        } else System.out.println("La película no existe.");
    }
    public void buscarPeliculaGenero(Pelicula[] listPeliculas) {
        System.out.println("Género de la película a buscar: ");
        String genero = leer.nextLine();
        boolean encontrado = false;
        for (int i = 0; i < listPeliculas.length; i++) {
            if(listPeliculas[i].getGenero().equalsIgnoreCase(genero)){
                encontrado = true;
                break;
            }
        }
        if(encontrado){
            System.out.println("La película del género " + genero + " existe.");
        } else System.out.println("La película no existe.");
    }
}
