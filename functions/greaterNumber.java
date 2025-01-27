package functions;

import java.util.Scanner;

public class greaterNumber {
    
    public static void Greater_number(int n, int m){
        if (n>m) {
            System.out.println("the " + n + " is greater than "+ m);
        }else{
            System.out.println("the " + m + " is greater than "+ n);
        }
        
    }
    
    
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter value for n: ");
            int n = sc.nextInt();

            System.out.println("Enter value for m: ");
            int m = sc.nextInt();

            Greater_number(n, m);
        }
    }
}
