package Entity;

public class CoffeMaker {
    private int maxCapacity;
    private int currentCapacity;
    public CoffeMaker(int maxCapacity, int currentCapacity) {
        this.maxCapacity = maxCapacity;
        this.currentCapacity = currentCapacity;
    }
    public CoffeMaker() {
    }
    public int getMaxCapacity() {
        return maxCapacity;
    }
    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }
    public int getCurrentCapacity() {
        return currentCapacity;
    }
    public void setCurrentCapacity(int currentCapacity) {
        this.currentCapacity = currentCapacity;
    }
    
}
