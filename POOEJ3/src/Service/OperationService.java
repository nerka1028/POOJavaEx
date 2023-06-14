package Service;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

import Entity.Operation;
public class OperationService {
    Scanner read = new Scanner(System.in);
    public void createOperation(Operation operation) {
        operation.setNumber1(read.nextInt());
        operation.setNumber2(read.nextInt());
    }
    public void sum(Operation operation) {
        int num1 = operation.getNumber1();
        int num2 = operation.getNumber2();
        int suma = num1 + num2;
        System.out.println("Sum: " + suma);
    }
    public void substract(Operation operation) {
        int num1 = operation.getNumber1();
        int num2 = operation.getNumber2();
        int substract = Math.abs(num1-num2);
        System.out.println("Substraction: " + substract);
    }
    public void multiply(Operation operation) {
        int num1 = operation.getNumber1();
        int num2 = operation.getNumber2();
        int multiply = num1*num2;
        System.out.println("Multiplication: "+ multiply);
    }
    public void divide(Operation operation) {
        int num1 = operation.getNumber1();
        int num2 = operation.getNumber2();
        if(num2 != 0) System.out.println("Division: " + num1/num2);
        else System.out.println("Number 2 can't be 0.");
    }
}
