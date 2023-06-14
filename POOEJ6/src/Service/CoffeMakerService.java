package Service;
import Entity.CoffeMaker;
import java.util.Scanner;
public class CoffeMakerService {
    CoffeMaker coffeMaker = new CoffeMaker();
    Scanner read = new Scanner(System.in);
    public void fillCoffeMaker() {
        coffeMaker.setMaxCapacity(read.nextInt());
        coffeMaker.setCurrentCapacity(coffeMaker.getMaxCapacity());
        System.out.println("Current capacity: " + coffeMaker.getCurrentCapacity());
    }
    public void fillCup(int cupSize) {
        int currentCoffe = coffeMaker.getCurrentCapacity();
        if (currentCoffe < cupSize){
            System.out.println("Casi se llena la taza :(");
            coffeMaker.setCurrentCapacity(currentCoffe-cupSize);
        } else if (currentCoffe == cupSize){
            System.out.println("Se llenó la taza!");
            coffeMaker.setCurrentCapacity(0);
        } else {
            System.out.println("La taza se desbordó!");
            coffeMaker.setCurrentCapacity(currentCoffe-cupSize);
        }
    }
    public void emptyCoffeMaker() {
        coffeMaker.setCurrentCapacity(0);
        System.out.println("Empty: " + coffeMaker.getCurrentCapacity());
    }
    public void addCoffe(int coffe) {
        coffeMaker.setCurrentCapacity(coffe+coffeMaker.getCurrentCapacity());
       System.out.println("add coffe: " + coffeMaker.getCurrentCapacity());
    }
    
}
