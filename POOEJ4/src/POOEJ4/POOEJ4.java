package POOEJ4;
import Service.RectangleService;
public class POOEJ4 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        RectangleService rectangleService = new RectangleService();
        rectangleService.createRectangle();
        rectangleService.area();
        rectangleService.perimeter();
    }
}
