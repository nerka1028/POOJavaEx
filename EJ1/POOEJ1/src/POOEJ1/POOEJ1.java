package POOEJ1;
import Entidad.Persona;
import Servicio.PersonaService;

public class POOEJ1 {
    public static void main(String[] args) {
        Persona primerPersona = new Persona("Karen", 010101,25);
        Persona segundPersona = new Persona();
        segundPersona.setName("John");
        System.out.println("Nombre: " + segundPersona.getName());
        PersonaService personaService = new PersonaService();
        personaService.mostrarPersona(primerPersona);
    }
}
