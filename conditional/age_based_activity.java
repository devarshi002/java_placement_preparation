package conditional;

import java.util.*;

public class age_based_activity {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("Eligible to vote");
            if (age >= 21) {
                System.out.println("Eligible for driving license");
            }
        } else if ( age < 13){
            System.out.println("Enjoy childhood");
        } else {
            System.out.println("Teenage is great phase of life");
        }
    }
  }  
}
