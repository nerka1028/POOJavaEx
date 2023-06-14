package POOEJ7;
import Entity.Person;
import Service.PersonService;
public class POOEJ7 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        PersonService personService = new PersonService();
        personService.createPerson("Juan", 25, "M", 70, 1.70);
    }
}
