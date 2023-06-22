package Service;
import java.time.LocalDate;
import java.time.Period;

import Entity.Persona;
public class PersonaService {
    Persona persona;
    LocalDate fecha;
    Period period;
    public Persona crearPersona(String nombre, LocalDate cumpleaños) {
        persona = new Persona(nombre, cumpleaños);
        return persona;
    }
    public int calcularEdad(Persona persona) {
        Period period = Period.between(persona.getCumpleaños(), LocalDate.now());
        int edad = period.getYears();
        persona.setEdad(edad);
        System.out.println(persona.getNombre() + " tiene " + persona.getEdad() + " años.");
        return edad;
    }
    public boolean menorQue(int edad1, int edad2) {
        if(edad1<edad2) return true;
        else return false;
    }
    public void mostrarPersona(Persona persona) {
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Fecha de nacimiento: " + persona.getCumpleaños());
        System.out.println("Edad: " + persona.getEdad());
    }
}
