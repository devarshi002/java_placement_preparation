package loop;
import java.util.*;
public class whileloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;
        System.out.println("Enter a number to calculate the factorial");
        number = sc.nextInt();

        int fact = 1;
        int i = 1;

        while (i <= number) {
            fact *= i;
            i++;
        }
        System.out.println("the factorial of " + number + " is " + fact);
        sc.close();
    }
}
