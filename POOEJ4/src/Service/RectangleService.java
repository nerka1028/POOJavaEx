package Service;
import Entity.Rectangle;
import java.util.Scanner;
public class RectangleService {
    Rectangle rectangle = new Rectangle();
    Scanner read = new Scanner(System.in);
    public void createRectangle() {
        System.out.println("Base: ");
        rectangle.setBase(read.nextInt());
        System.out.println("Height: ");
        rectangle.setHeight(read.nextInt());
    }
    public void area() {
        System.out.println("Area: " + rectangle.getBase()*rectangle.getHeight()); 
    }
    public void perimeter() {
        System.out.println("Perimeter: " + (rectangle.getBase()+rectangle.getHeight())*2);
    }
}
