package Main;
import Entity.NIF;
import Service.NIFService;
public class Main {
    public static void main(String[] args) throws Exception {
        NIFService nifService = new NIFService();
        NIF nif = nifService.crearNIF();
        nifService.mostrarNIF(nif);
    }
}
