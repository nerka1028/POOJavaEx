package POOEJ9;
import java.util.Random;

import Entity.Mathematics;
import Service.mathService;
public class POOEJ9 {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        Mathematics numbers = new Mathematics();
        mathService mathService = new mathService();
        numbers.setNumber1(random.nextInt(10));
        System.out.println("Number 1: " + numbers.getNumber1());
        numbers.setNumber2(random.nextInt(10));
        System.out.println("Number 2: " + numbers.getNumber2());
        double greaterNumber = mathService.returnGreater(numbers);
        mathService.getPow(greaterNumber, numbers);
        mathService.getSquare(greaterNumber, numbers);
    }
}
