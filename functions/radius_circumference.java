package functions;

import java.util.Scanner;

public class radius_circumference {
    
    public static void Circumference(double n) {
        double c= 2 * 3.14 * n;
        System.out.println(c);
                
    }
    
    
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the value of radius: ");
            double n = sc.nextDouble();

            Circumference(n);
        }

    }
}
