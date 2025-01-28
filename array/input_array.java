package array;

import java.util.Scanner;

public class input_array {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the length of array: ");
            int size = sc.nextInt();
            int numbers[] = new int[size];

            System.out.println("Enter value in the array: ");

            for (int i = 0; i < size; i++) {
                numbers[i] = sc.nextInt();
            }

            System.out.println("Your array values are: ");
            for (int i = 0; i < size; i++) {
                System.out.println(numbers[i]);
            }
        }
    }
}
