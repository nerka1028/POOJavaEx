package Service;
import Entity.Raices;
public class RaicesService {
    public double getDeterminante(Raices raices) {
        double a = raices.getA();
        double b = raices.getB();
        double c = raices.getC();
        double determinante = (Math.pow(b, 2)-4*a*c);
        return determinante;
    }
    public boolean tieneRaices(Raices raices, double determinante) {
        boolean resultado = (determinante>0)? true:false;
        return resultado;
    }
    public boolean tieneRaiz(Raices raices, double determinante) {
        boolean resultado = (determinante == 0)? true:false;
        return resultado;
    }
    public void obtenerRaices(double determinante, Raices raices) {
        if(tieneRaices(raices, determinante)){
            determinante = Math.pow(determinante, 1/2);
            System.out.println("Raiz 1: ");
            System.out.printf("-%.0f+%.0f/(2*%.0f)",raices.getB(),determinante,raices.getA());
            System.out.println("");
            System.out.println("Raiz 2: ");
            System.out.printf("-%.0f-%.0f/(2*%.0f)",raices.getB(),determinante,raices.getA());
            System.out.println("");
        } else System.out.println("No tiene solucion");
    }
    public void obtenerRaiz(double determinante, Raices raices) {
        if(tieneRaiz(raices, determinante)){
            determinante = Math.pow(determinante, 1/2);
            System.out.println("Raiz 1: ");
            System.out.printf("-%.0f+%.0f/(2*%.0f)",raices.getB(),determinante,raices.getA());
            
        } else System.out.println("No tiene solucion");
    }
    public void calcular(Raices raices) {
        double determinante = getDeterminante(raices);
        obtenerRaices(determinante, raices);
        obtenerRaiz(determinante, raices);
    }
}
