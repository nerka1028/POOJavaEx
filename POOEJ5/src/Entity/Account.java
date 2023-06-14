package Entity;

public class Account {
    private int accountNumber;
    private long clientDNI;
    private double currentSalary;
    public Account(int accountNumber, long clientDNI, int currentSalary) {
        this.accountNumber = accountNumber;
        this.clientDNI = clientDNI;
        this.currentSalary = currentSalary;
    }
    public Account() {

    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public long getClientDNI() {
        return clientDNI;
    }
    public void setClientDNI(long clientDNI) {
        this.clientDNI = clientDNI;
    }
    public double getCurrentSalary() {
        return currentSalary;
    }
    public void setCurrentSalary(double currentSalary) {
        this.currentSalary = currentSalary;
    }
    
}
