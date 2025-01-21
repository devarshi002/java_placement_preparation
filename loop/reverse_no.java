package loop;
import java.util.*;
public class reverse_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        int reversedNumber = 0;

        while (number !=0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /=10;
        }
        System.out.println("Reversed number: " + reversedNumber);
        sc.close();
    }
}
