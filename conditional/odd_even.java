package conditional;
import java.util.*;
public class odd_even {
     public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();

            if(x % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("odd");
            }
        }
     }
}
