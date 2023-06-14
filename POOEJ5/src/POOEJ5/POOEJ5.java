package POOEJ5;
import Entity.Account;
import Service.ServiceAccount;
public class POOEJ5 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        ServiceAccount serviceAccount = new ServiceAccount();
        serviceAccount.createAccount();
        serviceAccount.enter();
        serviceAccount.withdraw();
        serviceAccount.fastWithdraw();
        serviceAccount.balanceConsult();
    }
}
