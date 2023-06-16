package Service;
import Entity.Mathematics;
import java.util.Scanner;

public class mathService {
    Scanner read = new Scanner(System.in);
    Mathematics math = new Mathematics();
    public double returnGreater(Mathematics math) {
        if(math.getNumber1()>math.getNumber2()) return math.getNumber1();
        else if(math.getNumber2()==math.getNumber1()) return math.getNumber1();
        else return math.getNumber2();
    }
    public void getPow(double number1, Mathematics math) {
        double number2;
        if (number1 == math.getNumber1()) number2 = math.getNumber2();
        else number2 = math.getNumber1();
        
        int num1 = (int) Math.ceil(number1);
        int num2 = (int) Math.ceil(number2);
        double result = Math.pow(num1,num2);
        System.out.println("Pow: " + result);
    }
    public void getSquare(double number1, Mathematics math) {
        double number2;
        if (number1 == math.getNumber1()) number2 = math.getNumber2();
        else number2 = math.getNumber1();
        System.out.println("Square: " + Math.sqrt(number2));
    }
    
}
