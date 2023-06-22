package POOEJ12;
import Entity.Persona;
import Service.PersonaService;

import java.time.LocalDate;
import java.util.Scanner;
public class POOEJ12 {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);
        PersonaService personaService = new PersonaService();
        System.out.println("Name: ");
        String nombre = read.nextLine();
        System.out.println("Cumpleaños: ");
        LocalDate cumpleaños = LocalDate.of(read.nextInt(), read.nextInt(), read.nextInt());
        Persona persona = personaService.crearPersona(nombre, cumpleaños);
        int edad = personaService.calcularEdad(persona);
        System.out.println("Edad 2: ");
        int edad2 = read.nextInt();
        System.out.println("Es " + persona.getNombre() + " menor que " + edad2 + "?");
        System.out.println(personaService.menorQue(edad, edad2));
        personaService.mostrarPersona(persona);
    }
}
