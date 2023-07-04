package Main;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        String mesSecreto = meses[1];
        String guess = "";
        do {
            System.out.println("Adivina el mes: ");
            guess = leer.nextLine();

            
        } while (guess.equals(mesSecreto) == false);
        System.out.println("Adivinaste!");

    }
}
