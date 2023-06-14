package Service;
import Entity.Vehicle;

import java.util.Arrays;
import java.util.Scanner;
public class vehicleService {
    Scanner read = new Scanner(System.in);

    public Vehicle CreateVehicle() {
        System.out.println("Type: ");
        String type = read.nextLine();
        Vehicle vehicle = new Vehicle(type);
        return vehicle;
    }

    public int Move(Vehicle vehicle) {
        int speed;
        if (vehicle.getType().equalsIgnoreCase("car")) speed = 3;
        else if (vehicle.getType().equalsIgnoreCase("motorcycle")) speed = 2;
        else speed = 1;
        return speed;
    }

    public int Stop(Vehicle vehicle) {
        int stopDistance = 2;
        if (vehicle.getType().equalsIgnoreCase("bike")) stopDistance = 0;
        return stopDistance;
    }

    public int finishLine(int speed, int stopDistance, int time) {
        int finishDistance = speed*time+stopDistance;
        return finishDistance;
    }

    public void furtherVehicle(Vehicle vehicle1, Vehicle vehicle2, Vehicle vehicle3) {
        int [] finalDistance = new int[3];
        int i;
        finalDistance[0] = vehicle1.getFinishDistance();
        finalDistance[1] = vehicle2.getFinishDistance();
        finalDistance[2] = vehicle3.getFinishDistance();
        for (i = 0; i < finalDistance.length; i++) {
            System.out.println("Vehicle: " + i + " Final Distance: " + finalDistance[i] );
        }
        int mayor = Arrays.stream(finalDistance).max().getAsInt();
        
        for (i = 0; i < finalDistance.length; i++) {
            if(finalDistance[i]== mayor) break;
        }

        System.out.println("El vehículo " + i + " es el ganador con una distancia final de: " + finalDistance[i]);
    }
}
