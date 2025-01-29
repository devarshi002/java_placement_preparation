package array;

import java.util.Scanner;

public class exampleTwoDarray {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int row = sc.nextInt();
            int cols  = sc.nextInt();

            int[][] numbers = new int[row][cols];

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < cols; j++) {
                    numbers[i][j] = sc.nextInt();
                }
            }

            int x = sc.nextInt();

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < cols; j++) {
                    if (numbers[i][j] == x) {
                        System.out.println("X found at locations (" + i + "," + j + ")");
                    }
                }
            }
        }
    }
}
