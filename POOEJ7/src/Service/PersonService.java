package Service;
import java.util.Scanner;

import Entity.Person;
public class PersonService {
    Scanner read = new Scanner(System.in);
    Person person = new Person();
    public void createPerson(String name, int age, String sex, double weight, double height) {
        person.setName(name);
        person.setAge(age);
        if (sex != "M" && sex != "F" && sex != "O") System.out.println("Invalid sex.");
        else person.setSex(sex);
        person.setWeight(weight);
        person.setHeight(height);
    }
    public void IMC() {
        double height = person.getHeight();
        double weight = person.getWeight();
        double imc = (weight)/(Math.pow(height, 2));
        int result;
        if (imc < 20){
            result = -1; 
            System.out.println("IMC result for person " + person.getName() + " is " + result);
        }
        else if (imc<26){
            result = 0; 
            System.out.println("IMC result for person " + person.getName() + " is " + result);
        }
        else if (imc>25){
            result = 1;
            System.out.println("IMC result for person " + person.getName() + " is " + result);
        }
    }
    public boolean isOver18() {
        boolean result = (person.getAge() > 17)? true:false;
        return result;
    }
}
