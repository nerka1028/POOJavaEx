package Entity;

public class Ahorcado {
    private char[] palabra;
    private int letras;
    private int jugadas;
    private int encontradas;
    private StringBuilder letrasBuscadas;
    
    public Ahorcado() {
    }
    public Ahorcado(char[] palabra, int letras, int jugadas, int encontradas, StringBuilder letrasBuscadas) {
        this.palabra = palabra;
        this.letras = letras;
        this.jugadas = jugadas;
        this.encontradas = encontradas;
        this.letrasBuscadas = letrasBuscadas;
    }
    public char[] getPalabra() {
        return palabra;
    }
    public void setPalabra(char[] palabra) {
        this.palabra = palabra;
    }
    public int getLetras() {
        return letras;
    }
    public void setLetras(int letras) {
        this.letras = letras;
    }
    public int getJugadas() {
        return jugadas;
    }
    public void setJugadas(int jugadas) {
        this.jugadas = jugadas;
    }
    public int getEncontradas() {
        return encontradas;
    }
    public void setEncontradas(int encontradas) {
        this.encontradas = encontradas;
    }
    public StringBuilder getLetrasBuscadas() {
        return letrasBuscadas;
    }
    public void setLetrasBuscadas(StringBuilder letrasBuscadas) {
        this.letrasBuscadas = letrasBuscadas;
    }
}
