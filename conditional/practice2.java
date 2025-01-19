package conditional;
import java.util.*;
public class practice2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if(a==b) {
                System.out.println("Equal");
            } else if(a > b) {
                System.out.println("a is greater");
            } else {
                System.out.println("a is smaller");
            }
        }
    }
}
