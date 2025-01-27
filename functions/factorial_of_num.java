package functions;

import java.util.Scanner;

public class factorial_of_num {
    
    public static void Factorial(int n){
        if (n < 0) {
            System.out.println("Invalid Number: ");
            return;
        }
        
        int fact = 1;
        System.out.println("Factorial of number "+ n + " is : ");
        for (int i = n; i>=1; i--) {
            fact = fact * i;
        }
        
        System.out.println(fact);
        
    }
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter number for factorial: ");
            int n = sc.nextInt();
            Factorial(n);
        }
    }
}
