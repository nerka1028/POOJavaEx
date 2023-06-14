package Entity;

public class Vehicle {
    private String brand;
    private String model;
    private String type;
    private int year;
    private int finishDistance;

    public Vehicle(String type) {
        this.type = type;
    }
    public Vehicle() {
    }
    public Vehicle(String brand, String model, String type, int year) {
        this.brand = brand;
        this.model = model;
        this.type = type;
        this.year = year;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getFinishDistance() {
        return finishDistance;
    }
    public void setFinishDistance(int finishDistance) {
        this.finishDistance = finishDistance;
    }
}
