package Servicio;
import Entidad.Persona;

public class PersonaService {
   
    public static void mostrarPersona(Persona persona) {
        // Utilizar getters para obtener los atributos y mostrarlos
        System.out.println("Nombre: " + persona.getName());
        System.out.println("Edad: " + persona.getAge());
        System.out.println("ID: " + persona.getId());
    }
}
