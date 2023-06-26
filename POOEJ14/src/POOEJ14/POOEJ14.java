package POOEJ14;
import Entity.Movil;
import Service.MovilService;
public class POOEJ14 {
    public static void main(String[] args) throws Exception {
        
        MovilService movilService = new MovilService();
        Movil movil = movilService.cargarCelular();
        movilService.mostrarCelular(movil);
    }
}
