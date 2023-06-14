package POOEJ6;
import Entity.CoffeMaker;
import Service.CoffeMakerService;
public class POOEJ6 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        CoffeMakerService coffeMakerService = new CoffeMakerService();
        coffeMakerService.fillCoffeMaker();
        coffeMakerService.fillCup(4);
        coffeMakerService.emptyCoffeMaker();
        coffeMakerService.addCoffe(5);
    }
}
