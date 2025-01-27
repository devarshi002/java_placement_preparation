package functions;

import java.util.Scanner;

public class even_odd {
    
    public static boolean isEven(int number){
        return number % 2 == 0;
    }

    public static boolean Divisible(int number){
        return number % 5 == 0;
    }
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Please enter a number: ");
            int num = sc.nextInt();
            if (isEven(num)) {
                System.out.println(num + " is even.");
            }
            else {
                System.out.println(num + " is odd");
            }

            if (Divisible(num)) {
                System.out.println(num + " divisible by 5.");
            }
            else {
                System.out.println(num + " Not div by 5");
            }
        }        
    }
}
