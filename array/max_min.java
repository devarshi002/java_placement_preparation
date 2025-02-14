package array;

import java.util.Scanner;

public class max_min {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int size = sc.nextInt();
            int numbers[] = new int[size];

            for (int i = 0; i < size; i++) {
                numbers[i] = sc.nextInt();
            }


            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;


            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] < min) {
                    min = numbers[i];
                }
                if (numbers[i] > max) {
                    max = numbers[i];
                }
            }
            System.out.println("Maximum value: " + max);
            System.out.println("Minimum value: " + min);
        }
    }
}
