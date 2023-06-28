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
        return new Alquiler(peliculaAlquilada, fechaInicio, fechaFin);
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
    public void listaAlquiler(Alquiler[] listaAlquiler) {
        for (int i = 0; i < listaAlquiler.length; i++) {
            System.out.println("Película " + i + ":" + listaAlquiler[i].getPeliculaAlquilada());
        }
    }
    public void buscarAlquiler(Alquiler[] listaAlquiler) {
        System.out.println("Fecha del alquiler a buscar: ");
        System.out.println("Año: ");
        int yearF = leer.nextInt();
        System.out.println("Mes: ");
        int mesF = leer.nextInt();
        System.out.println("Día: ");
        int diaF = leer.nextInt();
        Date fecha = new Date(yearF, mesF, diaF);
        boolean encontrado = false;
        for (int i = 0; i < listaAlquiler.length; i++) {
            if(listaAlquiler[i].getFechaInicio() == fecha){
                encontrado = true;
                break;
            }
        }
        if(encontrado){
            System.out.println("El alquiler existe.");
        } else System.out.println("El alquiler no existe.");
    }
    public void calcularIngreso(Alquiler alquiler) {
        long milisecondsByDay = 86400000;
        long dias = (alquiler.getFechaInicio().getTime()-alquiler.getFechaFin().getTime())/milisecondsByDay;
        double precio= 10;
        if(dias>3){
            for (int i = 0; i < dias-3; i++) {
                precio = precio + precio*0.1;
            }
        }
        alquiler.setPrecio(precio);
    }
}
