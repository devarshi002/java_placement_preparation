package array;

import java.util.Scanner;

public class searchNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the length of array: ");
            int size = sc.nextInt();
            int numbers[] = new int[size];

            System.out.println("Enter the value in the array: ");
            for (int i = 0; i < size; i++) {
                numbers[i] = sc.nextInt();
            }

            System.out.println("Enter the value you want to check: ");
            int x = sc.nextInt();

            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] == x) {
                    System.out.println(x + " found in index: " + i);
                }
            }
        }


    }
}
