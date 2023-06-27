package POOEX02;
import Entity.Punto;
import Service.PuntosService;
public class POOEX02 {
    public static void main(String[] args) throws Exception {
        PuntosService puntosService = new PuntosService();
        System.out.println("-------Punto1-------");
        Punto punto1 = puntosService.crearPuntos();
        System.out.println("-------Punto2-------");
        Punto punto2 = puntosService.crearPuntos();
        puntosService.calculoDistancia(punto1, punto2);
    }
}
