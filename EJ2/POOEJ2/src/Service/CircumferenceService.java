package Service;
import java.util.Scanner;

import Entity.Circumference;
public class CircumferenceService {
    Scanner read = new Scanner(System.in);
    public void createCircumference(Circumference circle) {
        double radio = read.nextDouble();
        circle.setRadio(radio);
    }
    public void area(Circumference circle) {
        double radio = circle.getRadio();
        double area = Math.PI*Math.pow(radio, 2);
        System.out.println("Area: " + area);        
    }
    public void perimeter(Circumference circle) {
        double radio = circle.getRadio();
        double perimeter = Math.PI*radio*2;
        System.out.println("Perimeter: " + perimeter);
    }
}
