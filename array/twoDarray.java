package array;

import java.util.Scanner;

public class twoDarray {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int row = sc.nextInt();
            int cols = sc.nextInt();

            int[][] numbers = new int[row][cols];

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < cols; j++) {
                    numbers[i][j] = sc.nextInt();
                }
            }

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(numbers[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
