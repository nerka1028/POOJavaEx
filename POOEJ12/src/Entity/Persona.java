package Entity;

import java.time.LocalDate;

public class Persona {
    private String nombre;
    private LocalDate cumpleaños;
    private int edad;
    public Persona(String nombre, LocalDate cumpleaños) {
        this.nombre = nombre;
        this.cumpleaños = cumpleaños;
    }
    public Persona() {
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public LocalDate getCumpleaños() {
        return cumpleaños;
    }
    public void setCumpleaños(LocalDate cumpleaños) {
        this.cumpleaños = cumpleaños;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
