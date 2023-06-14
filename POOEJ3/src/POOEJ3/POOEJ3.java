package POOEJ3;

import Entity.Operation;
import Service.OperationService;

public class POOEJ3 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Operation operation =  new Operation();
        OperationService operationService = new OperationService();
        operationService.createOperation(operation);
        operationService.sum(operation);
        operationService.substract(operation);
        operationService.multiply(operation);
        operationService.divide(operation);
    }
}
