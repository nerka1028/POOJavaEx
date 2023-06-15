package Service;

import java.util.Scanner;

import Entity.Cadena;

public class CadenaService {
    Scanner read = new Scanner(System.in);
    Cadena cadena = new Cadena();

    public void mostrarVocales(Cadena cadena) {
        char[] charArray = cadena.getFrase().toCharArray();
        int contadorVocales = 0;
        for (char c : charArray) {
            if(esVocal(c)) contadorVocales++;
        }
        System.out.println("La frase: \"" + cadena.getFrase() + "\" tiene " + contadorVocales + " vocales.");
    }
    public static boolean esVocal(char letra) {
        String vocales = "aeiouAEIOU";
        
        return vocales.contains(Character.toString(letra));
    }

    public void invertirFrase(Cadena cadena) {
        char[] charArray = cadena.getFrase().toCharArray();
        char[] newCharArray = new char[charArray.length];
        int contador = 0;
        for (int i = newCharArray.length; i < 0 ; i--) {
            contador++;
            newCharArray[i] = charArray[contador];
        }
        for (char c : newCharArray) {
            System.out.print(c);
        }  
    }
    public void vecesRepetido(String letra, Cadena cadena) {
        char letter = letra.charAt(0);
        char[] charArray = cadena.getFrase().toCharArray();
        int contadorRepetidos = 0;
        for (char c : charArray) {
            if(c == letter) contadorRepetidos++;
        }
        System.out.println("La letra " + letter + " se repite " + contadorRepetidos + " veces.");
    }
    public void comparar(Cadena cadena, String frase2) {
        if(cadena.getLongFrase() == frase2.length()) System.out.println("La longitud de las cadenas es la misma");
        else System.out.println("La longitud no es igual.");
    }
    public void unirFrase(Cadena cadena, String frase2) {
        String resultado = cadena.getFrase().concat(" ").concat(frase2);
        System.out.println("Concatenado: " + resultado);
    }
    public void reemplazar(Cadena cadena, String letra) {
        char[] charArray = cadena.getFrase().toCharArray();
        for (char c : charArray) {
            c = (c == 'a')? letra.charAt(0) : c;
            System.out.print(c);
        }
        System.out.println("");
    }
    public void contiene(Cadena cadena, String letra) {
        System.out.println("La frase: \"" + cadena.getFrase() + "\" contiene la letra " + letra + "?");
        System.out.println(cadena.getFrase().contains(letra));
    }
}
