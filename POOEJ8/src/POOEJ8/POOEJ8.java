package POOEJ8;
import Entity.Cadena;
import Service.CadenaService;
import java.util.Scanner;
public class POOEJ8 {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);
        Cadena cadena = new Cadena();
        CadenaService cadenaService = new CadenaService();
        System.out.println("Ingrese la frase: ");
        cadena.setFrase(read.nextLine());
        cadenaService.mostrarVocales(cadena);
        cadenaService.invertirFrase(cadena);
        System.out.println("Ingrese una letra: ");
        cadenaService.vecesRepetido(read.nextLine(), cadena);
        System.out.println("Ingrese la frase2: ");
        String frase2 = read.nextLine();
        cadenaService.comparar(cadena, frase2);
        cadenaService.unirFrase(cadena, frase2);
        System.out.println("Ingrese un caracter: ");
        String caracter = read.nextLine();
        cadenaService.reemplazar(cadena, caracter);
        System.out.println("Ingrese una letra: ");
        String letra = read.nextLine();
        cadenaService.contiene(cadena, letra);
    }
}
