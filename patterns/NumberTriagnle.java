package patterns;

import java.util.Scanner;

public class NumberTriagnle {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of rows: ");
            int rows = sc.nextInt();

            System.out.println("this is your ans: ");

            for (int i = 1; i <=rows; i++) {
                for (int j = 1; j <= i; j++) {
                    
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }
    }
}
