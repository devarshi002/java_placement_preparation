package conditional;
import java.util.*;
public class electricity_bill {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int unit = sc.nextInt();

            if (unit == 100) {
                System.out.println("3 rs per unit");
            } else if(unit >= 100 && unit <=200) {
                System.out.println("5 rs per unit");
            } else if (unit > 200 ) {
                System.out.println("10 rs per unit");
            } else {
                System.out.println("please enter proper unit");
            }
        }
    }
}
