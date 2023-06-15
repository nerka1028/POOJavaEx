package POOEJ7;
import Entity.Person;
import Service.PersonService;
public class POOEJ7 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        PersonService personService = new PersonService();
        Person person1 = personService.createPerson("Juan", 25, 'M', 40, 1.70);
        Person person2 = personService.createPerson("Mary", 70, 'F', 80, 1.60);
        Person person3 = personService.createPerson("Camilo", 16, 'M', 40, 1.80);
        int [] imcs = new int[3];
        System.out.println("Person: " + person1.getName() +" Sex:" + person1.getSex());
        imcs[0] = personService.IMC(person1);
        personService.isOver18(person1);
        System.out.println("Person: " + person2.getName() +" Sex:" + person2.getSex());
        imcs[1] = personService.IMC(person2);
        personService.isOver18(person2);
        System.out.println("Person: " + person3.getName() +" Sex:" + person3.getSex());
        imcs[2] = personService.IMC(person3);
        personService.isOver18(person3);

        personService.percentageIMC(imcs);
    }
}
