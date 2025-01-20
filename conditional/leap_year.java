package conditional;

import java.util.*;

public class leap_year {
    /**
     * @param args
     */
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a year to check if it is a leap year:");
            int year = sc.nextInt();

            if (year % 4 == 0 ) {
                
             if (year % 100 == 0) {
                
              if (year % 400 == 0) {
                
            } else {
                System.out.println(year + "leap yr");
            }
        } else {
            System.out.println(year + "not leap");
        }
        
    } else {
        System.out.println(year + "leap year");
    }
}
}
}
