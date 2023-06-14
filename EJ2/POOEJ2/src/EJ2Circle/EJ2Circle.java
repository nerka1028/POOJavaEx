package EJ2Circle;

import Entity.Circumference;
import Service.CircumferenceService;

public class EJ2Circle {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Circumference circumference = new Circumference();
        CircumferenceService circumferenceService = new CircumferenceService();
        circumferenceService.createCircumference(circumference);
        circumferenceService.area(circumference);
        circumferenceService.perimeter(circumference);
    }
}
