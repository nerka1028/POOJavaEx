package Service;
import Entity.NIF;
import java.util.Scanner;
public class NIFService {
    Scanner leer = new Scanner(System.in);
    public NIF crearNIF() {
        System.out.println("DNI: ");
        int dni = leer.nextInt();
        char letra = cacularLetra(dni);
        NIF nif = new NIF(dni, letra);
        return nif;
    }
    public char cacularLetra(int dni) {
        String letrasDni = "TRWAGMYFPDXBNJZSQVHLCKE";
        int resto = dni % 23;
        return letrasDni.charAt(resto);
    }
    public void mostrarNIF(NIF nif) {
        System.out.println("NIF: " + nif.getDni() + nif.getLetra());
    }
}
