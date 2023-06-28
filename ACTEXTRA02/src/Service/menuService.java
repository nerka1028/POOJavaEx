package Service;
import Service.AlquilerService;
import Service.PeliculaService;
import java.util.Scanner;

import Entity.Alquiler;
import Entity.Pelicula;
public class menuService {
    Scanner leer = new Scanner(System.in);
    PeliculaService peliculaService = new PeliculaService();
    AlquilerService alquilerService = new AlquilerService();
    Alquiler alquiler = new Alquiler();
    public int mostrarMenu() {
        System.out.println("---- Menu ----");
        System.out.println("1. Crear película.");
        System.out.println("2. Crear alquiler.");
        System.out.println("3. Listar películas");
        System.out.println("4. Listar alquileres");
        System.out.println("5. Buscar película por título.");
        System.out.println("6. Buscar película por género.");
        System.out.println("7. Buscar película por fecha.");
        System.out.println("8. Calcular ingreso.");
        System.out.println("9. Salir");
        int opcion = leer.nextInt();
        return opcion;
    }
    public void llamarMetodos(int opcion) {
        Pelicula[] listPeliculas;
        Alquiler[] listaAlquiler;
        switch (opcion) {
            case 1:
                listPeliculas =  peliculaService.cargarPeliculas();
                break;
            case 2:
                listaAlquiler = alquilerService.cargarAlquiler();
                break;
            case 3:
                peliculaService.listaPeliculas(listPeliculas);
                break;
            case 4:
                alquilerService.listaAlquiler(listaAlquiler);
                break;
            case 5:
                peliculaService.buscarPeliculaTitulo(listPeliculas);
                break;
            case 6:
                peliculaService.buscarPeliculaGenero(listPeliculas);
                break;
            case 7:
                alquilerService.buscarAlquiler(listaAlquiler);
                break;
            case 8: 
                alquilerService.calcularIngreso(Alquiler alquiler);
                break;
            case 9: 
                System.out.println("Gracias por participar.");
                break;
            default:
                break;
        }
    }
}
