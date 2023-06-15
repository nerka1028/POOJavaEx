package Service;
import java.util.Scanner;

import Entity.Person;
public class PersonService {
    Scanner read = new Scanner(System.in);
    Person person;
    public Person createPerson(String name, int age, Character sex, double weight, double height) {
        while(sex != 'M' && sex != 'F' && sex != 'O'){
            System.out.println("Sex is incorrect, please try again.");
            sex = read.next().toUpperCase().charAt(0);
        }
        person = new Person(name, age, sex, weight, height);
        return person;
    }
    public int IMC(Person person) {
        double height = person.getHeight();
        double weight = person.getWeight();
        double imc = (weight)/(Math.pow(height, 2));
        int result;
        if (imc < 20){
            result = -1; 
            System.out.println("IMC result for person " + person.getName() + " is " + result + " so, it is underweight.");
        }
        else if (imc<26){
            result = 0; 
            System.out.println("IMC result for person " + person.getName() + " is " + result + " so, it is on the right weight.");
        }
        else{
            result = 1;
            System.out.println("IMC result for person " + person.getName() + " is " + result + " so, it is overweight.");
        }
        return result;
    }
    public void isOver18(Person person) {
        boolean result = (person.getAge() > 17)? true:false;
        System.out.println("Person " + person.getName() + " is over 18? " + result);
    }

    public void percentageIMC(int[] imcs){
        double contU = 0;
        double contN = 0; 
        double contO = 0;
        for (int imc : imcs) {
            if(imc == -1) contU++;
            if(imc == 0) contN++;
            if(imc == 1) contO++;
        }
        System.out.println("% underweight: " + contU*100/imcs.length + " %");
        System.out.println("% normal: " + contN*100/imcs.length + " %");
        System.out.println("% overweight: " + contO*100/imcs.length + " %");
    }

    
}
