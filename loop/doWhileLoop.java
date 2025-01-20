package loop;
import java.util.*;
public class doWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;
        int attempts = 0;

        do{
            System.out.println("Enter a positive number: ");
            number = sc.nextInt();
            attempts++;
        }while (number <= 0);

        System.out.println("you entered a positive number after " + attempts + " attempts.");
        sc.close();
    }
}
