package loop;

import java.util.*;


public class primecheck {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number: ");
            int n = sc.nextInt();

            if (isPrime(n)) {
                System.out.println(n + " Is a prime no.");
            }
            else {
                System.out.println(n + " Is not a prime no.");
            }
        }
    }

    public static boolean isPrime(int n){
        if (n <= 1){
            return false;
        }
        for (int i = 2; i <=Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
