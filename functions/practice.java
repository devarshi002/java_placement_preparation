package functions;

import java.util.Scanner;

public class practice {
    
    public static double calculateAverage(int[] numbers, int sizes){
        int sum = 0;

        // calculate the sum of numbers
        for (int number : numbers) {
            sum += number;
        }

        return (double) sum / sizes;
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter " + n + " numbers: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        double average = calculateAverage(numbers, n);
        System.out.println("the average is: " + average);
        sc.close();

    }
}
