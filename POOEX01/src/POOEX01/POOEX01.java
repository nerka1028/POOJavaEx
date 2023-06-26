package POOEX01;
import Service.cancionService;
import Entity.cancion;
public class POOEX01 {
    public static void main(String[] args) throws Exception {
        cancionService cancionService = new cancionService();
        cancion cancion = cancionService.guardarCancion();
        cancionService.mostrarCancion(cancion);
    }
}
