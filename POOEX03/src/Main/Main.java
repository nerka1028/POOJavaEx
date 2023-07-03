package Main;
import Entity.Raices;
import Service.RaicesService;
public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        RaicesService raicesService = new RaicesService();
        Raices raices = new Raices(2, 5, 2);
        raicesService.calcular(raices);
    }
}
