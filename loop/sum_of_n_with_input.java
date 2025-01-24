package loop;

import java.util.*;

public class sum_of_n_with_input {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Please enter a number: ");
            int n = sc.nextInt();

            int sum = 0;

            for (int i = 0; i <= n; i++) {
                sum = sum + i;
            }
            System.out.println("Total number of sum is: " + sum);
        }
    }
}
