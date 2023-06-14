package Service;
import Entity.Account;
import java.util.Scanner;
public class ServiceAccount {
    Account account = new Account();
    Scanner read = new Scanner(System.in);
    public void createAccount() {
        System.out.println("Account number: ");
        account.setAccountNumber(read.nextInt());
        System.out.println("Client DNI: ");
        account.setClientDNI(read.nextLong());
        account.setCurrentSalary(0);
    }
    public void enter() {
        System.out.println("Enter money: ");
        account.setCurrentSalary(account.getCurrentSalary()+read.nextDouble());
    }
    public void withdraw() {
        System.out.println("withdraw money: ");
        double withdraw = read.nextDouble();
        if(withdraw<account.getCurrentSalary()) account.setCurrentSalary(account.getCurrentSalary()-withdraw);
        else account.setCurrentSalary(0);
    }
    public void fastWithdraw () {
        System.out.println("Only 20% of the current salary can be taken back:");
        double withdraw = read.nextDouble();
        if(withdraw>account.getCurrentSalary()*0.2) System.out.println("Can't take the money");
        else account.setCurrentSalary(account.getCurrentSalary()-withdraw);  
    }
    public void balanceConsult() {
        System.out.printf("Balance in account %s from user %d is %f", account.getAccountNumber(), account.getClientDNI(), account.getCurrentSalary());
    }
}
