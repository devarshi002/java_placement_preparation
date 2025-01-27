package functions;

import java.util.Scanner;

public class sum_of_odd {
    
    public static int sumOfOddNumbers(int n) {
        int sum = 0;

        for (int i = 1; i < n; i++) {
            if (i % 2 != 0) {
                sum +=i;
            }
        }
        return sum;
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int sum = sumOfOddNumbers(n);

        System.out.println("The sum of odd numbers from 1 to " + n + " is: " + sum);
        sc.close();
    }
}
