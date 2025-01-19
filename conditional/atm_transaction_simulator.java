package conditional;
import java.util.Scanner;

public class atm_transaction_simulator {
    public static void main(String[] args) {
        double balance = 5000.00;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.println("Choose an option:");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your current balance is: rs" +balance);
                    break;
                case 2:
                    System.out.println("Enter amount to deposit: rs");
                    double depositeAmount = sc.nextDouble();
                    if(depositeAmount > 0) {
                        balance += depositeAmount;
                        System.out.println("Successfully deposited rs" +depositeAmount);
                        System.out.println("New balance: rs" + balance);
                    } else {
                        System.out.println("Invalid deposit amount");
                    }
                    break;
                case 3:
                    System.out.println("Enter amount to withdraw: rs");
                    double withdrawAmount = sc.nextDouble();
                    if(withdrawAmount > 0 && withdrawAmount <= balance) {
                        balance -= withdrawAmount;
                        System.out.println("Successfully withdraw" + withdrawAmount);
                        System.out.println("Remaining balance:" + balance );
                    } else if (withdrawAmount > balance){
                        System.out.println("Insufficient balance!");
                    } else {
                        System.out.println("Invalid withdrawal amount");
                    }
                    break;

                    case 4:
                    System.out.println("Thank you for using the ATM. goodbye");
                    sc.close();
                    System.exit(0);

                    default:
                     System.out.println("Invalid option. Please try again");
            }
        }
    }
}
