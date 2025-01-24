package loop;
import java.util.*;
public class practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Enter your choice: ");
            System.out.println("1. Enter your marks");
            System.out.println("0. exit.");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Enter your marks");
                int marks = sc.nextInt();

                if (marks >=90 && marks <= 100) {
                    System.out.println("This is good marks");
                }
                else if (marks >=60 && marks <= 89) {
                    System.out.println("This is good marks");
                }
                else if (marks > 0 && marks <= 59) {
                    System.out.println("this is good marks");
                }
                else {
                    System.out.println("Invalid marks");
                }

            }
            else if (choice != 0) {
                System.out.println("Invalid choice. Please enter 1 to continue or 0 to exit");
            }
        } while (choice != 0);
        System.out.println("Program terminated");
        sc.close();
    }
}
