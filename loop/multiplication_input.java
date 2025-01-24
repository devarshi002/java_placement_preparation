package loop;
import java.util.*;
public class multiplication_input {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("plase enter the required table no.");
            int n = sc.nextInt();

            for (int i = 1; i <11; i++) {
                System.out.println(n + " x " + i + " = " + (n*i));
            }
        }
    }
}
