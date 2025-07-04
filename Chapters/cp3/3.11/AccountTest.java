import java.util.Scanner;
public class AccountTest {
    public static void main(String[] args) {
        Account userAccount = new Account("John Doe", 50.00);
        Scanner input = new Scanner(System.in);

        System.out.print("How much money would you like to withdraw?: $");
        double withdraw = input.nextDouble();

        userAccount.withdrawal(withdraw);

        if (userAccount.getBalance()<0){
            System.out.println("Withdrawal amount exceeded account balance.");
        }

        if (userAccount.getBalance()>=0){
            System.out.printf("Your new account balance is $%.2f %n", userAccount.getBalance());
        }
    }
}
