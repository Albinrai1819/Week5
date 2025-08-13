import java.util.Scanner;
public class bank_Account{
    public static void main(String[] args) {
        Scanner my_input = new Scanner(System.in);

        // Create a bank account with an opening balance
        int balance = 40000;
        System.out.println("Welcome to your Bank Account");
        System.out.println("Your opening balance is: " + balance);

        //  Deposit money
        System.out.println("Enter the amount you want to deposit: ");
        int deposit = my_input.nextInt();
        balance += deposit; // update balance after deposit balance = balance + deposite
        System.out.println("You have deposited: " + deposit);
        System.out.println("Your current balance is: " + balance);

        // Withdraw money until balance becomes 0
        while (balance > 0) {
            System.out.println("Enter the amount you want to withdraw: ");
            int withdrawal = my_input.nextInt();
            if (withdrawal < balance) {
                //Withdrawal is less than balance i.e line 15
                balance -= withdrawal;
                System.out.println("Congratulations, your closing balance is: " + balance);
            } else if (withdrawal == balance) {
                // Withdrawal equals balance
                balance -= withdrawal;
                System.out.println("Poor you, your closing balance is: " + balance);
            } else {
                // withdrawal greater than balance
                int over = withdrawal - balance;
                System.out.println("Sorry, withdrawal disallowed as it would overspend your account by: " + over);
            }
            if (balance == 0) {
                System.out.println("Your account balance is now 0. You brokey, earn some money can,t withdraw from now");
            }
        }
    }
}