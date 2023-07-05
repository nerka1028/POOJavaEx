package Service;
import Entity.Ahorcado;
import java.util.Scanner;

public class AhorcadoService {
    Scanner leer = new Scanner(System.in);
    private Ahorcado crearJuego() {
        System.out.println("Palabra> ");
        String word = leer.nextLine();
        System.out.println("Jugadas maximas> ");
        int jugadas = leer.nextInt();
        int letras = word.length();
        int encontradas = 0;
        char[] palabra = new char[letras];
        StringBuilder letrasBuscadas = new StringBuilder();
        for (int i = 0; i < palabra.length; i++) {
            palabra[i] = word.charAt(i);
        }
        Ahorcado ahorcado = new Ahorcado(palabra, letras, jugadas, encontradas, letrasBuscadas);

        return ahorcado;
    }
    private void longitud(Ahorcado ahorcado) {
        System.out.println("Longitud de palabra: "+ ahorcado.getLetras());
    }
    private boolean buscar(char letra, Ahorcado ahorcado) {
        boolean noEncontrada = true;
        int letrasEncontradas = 0;
        int encontradas = ahorcado.getEncontradas();
        int intentos = ahorcado.getJugadas();
        
        if(ahorcado.getLetrasBuscadas().toString().contains(String.valueOf(letra))){
            System.out.println("Esa letra ya se buscó, intenta con otra.");
            intentos = intentos-1;
            ahorcado.setJugadas(intentos);
        } else {
            ahorcado.getLetrasBuscadas().append(letra);
            System.out.println("letras buscadas: " + ahorcado.getLetrasBuscadas());
            char[] palabra = new char[ahorcado.getLetras()];
            palabra = ahorcado.getPalabra();
            for (int i = 0; i < ahorcado.getPalabra().length; i++) {
                 
                if(palabra[i] == letra) {
                    letrasEncontradas++;
                    ahorcado.setEncontradas(encontradas+letrasEncontradas);
                    System.out.println("Encontraste una letra!");
                } 
            }
            if(letrasEncontradas == 0){
                System.out.println("Esa letra no era :(");
                intentos = intentos-1;
                ahorcado.setJugadas(intentos);
            }
            if(ahorcado.getEncontradas()!=ahorcado.getLetras()){
                System.out.println("Letras encontradas: " + ahorcado.getEncontradas());
                int letrasFaltantes = ahorcado.getEncontradas()-ahorcado.getLetras();
                System.out.println("Letras faltantes: " + letrasFaltantes);
            } else {
                System.out.println("Felicidades, descubriste la palabra!");
                noEncontrada = false;
            }
        }
        return noEncontrada;
    }
    private void mostrarIntentos(Ahorcado ahorcado) {
        System.out.println("Intentos restantes: " + ahorcado.getJugadas());
    }
    public void juego() {
        Ahorcado ahorcado = crearJuego();
        longitud(ahorcado);
        System.out.println("Letra a buscar: ");
        char letra = leer.next().charAt(0);
        boolean resultado = true;
        
        do {
            resultado = buscar(letra,ahorcado);
            mostrarIntentos(ahorcado);
            if(resultado && ahorcado.getJugadas()>0){
                System.out.println("Siguiente letra: ");
                letra = leer.next().charAt(0); 
            }
        } while (resultado && ahorcado.getJugadas()>0);
        
        if(resultado == true && ahorcado.getJugadas()==0) System.out.println("No tienes mas intentos.");
        else System.out.println("Gracias por participar!");
    }
}
