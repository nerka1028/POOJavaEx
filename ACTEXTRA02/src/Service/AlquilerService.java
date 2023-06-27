package Service;
import java.util.Date;
import java.util.Scanner;
import Entity.Alquiler;
import Entity.Pelicula;
public class AlquilerService {
    Scanner leer = new Scanner(System.in);
    public Alquiler creaAlquiler() {
        System.out.println("Película alquilada: ");
        String peliculaAlquilada = leer.nextLine();
        System.out.println("------ Fecha Inicio -----");
        System.out.println("Año: ");
        int yearI = leer.nextInt();
        System.out.println("Mes: ");
        int mesI = leer.nextInt();
        System.out.println("Día: ");
        int diaI = leer.nextInt();
        Date fechaInicio = new Date(yearI, mesI, diaI);
        System.out.println("------ Fecha Fin -----");
        System.out.println("Año: ");
        int yearF = leer.nextInt();
        System.out.println("Mes: ");
        int mesF = leer.nextInt();
        System.out.println("Día: ");
        int diaF = leer.nextInt();
        Date fechaFin = new Date(yearF, mesF, diaF);
        System.out.println("Precio: ");
        double precio = leer.nextDouble();
        return new Alquiler(peliculaAlquilada, fechaInicio, fechaFin, precio);
    }
    public Alquiler[] cargarAlquiler() {
        System.out.println("Cantidad de alquileres: ");
        int cantidadAlquiler = leer.nextInt();
        Alquiler[] listaAlquiler = new Alquiler[cantidadAlquiler];
        for (int i = 0; i < listaAlquiler.length; i++) {
            listaAlquiler[i] = creaAlquiler() ;
        }
        return listaAlquiler;
    }
    

}
