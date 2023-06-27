package Service;
import Entity.Punto;
import java.util.Scanner;
public class PuntosService {
    Punto punto;
    Scanner read = new Scanner(System.in);
    public Punto crearPuntos() {
        System.out.println("X: ");
        double x = read.nextDouble();
        System.out.println("Y: ");
        double y = read.nextDouble();
        punto = new Punto(x, y);
        return punto;
    }
    public void calculoDistancia(Punto punto1, Punto punto2) {
        double x1 = punto1.getX();
        double y1 = punto1.getY();
        double x2 = punto2.getX();
        double y2 = punto2.getY();
        double distancia = Math.sqrt(Math.pow((x2-x1), 2)+Math.pow((y2-y1),2));
        System.out.println("Distancia: " + distancia);
    }
}
