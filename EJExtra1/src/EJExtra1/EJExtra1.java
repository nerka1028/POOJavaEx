package EJExtra1;
import Entity.Vehicle;
import Service.vehicleService;
public class EJExtra1 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
         vehicleService vehicleService = new vehicleService();
        int time = 300;
        int time1 = 5;
        int time2 = 10;
        int time3 = 60;
       
        Vehicle vehicle1 = vehicleService.CreateVehicle();
        int speedVehicle1 = vehicleService.Move(vehicle1);
        int stopDistance1 = vehicleService.Stop(vehicle1);
        int finishLine1 = vehicleService.finishLine(speedVehicle1,stopDistance1, time);
        vehicle1.setFinishDistance(finishLine1);
        
        Vehicle vehicle2 = vehicleService.CreateVehicle();
        int speedVehicle2 = vehicleService.Move(vehicle2);
        int stopDistance2 = vehicleService.Stop(vehicle2);
        int finishLine2 = vehicleService.finishLine(speedVehicle2,stopDistance2, time);
        vehicle2.setFinishDistance(finishLine2);

        Vehicle vehicle3 = vehicleService.CreateVehicle();
        int speedVehicle3 = vehicleService.Move(vehicle3);
        int stopDistance3 = vehicleService.Stop(vehicle3);
        int finishLine3 = vehicleService.finishLine(speedVehicle3,stopDistance3, time);
        vehicle3.setFinishDistance(finishLine3);

        vehicleService.furtherVehicle(vehicle1, vehicle2, vehicle3);

    }
}
