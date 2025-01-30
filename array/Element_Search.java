package array;

import java.util.Arrays;
import java.util.Scanner;

public class Element_Search {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,7,8,23,55};
        System.out.println("Original array is: " + Arrays.toString(arr));

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the element to search: ");
        int key = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at index: " + i);
                found = true;
                break;
            }

            if (!found) {
                System.out.println("Element not found in the array: ");

            }
            sc.close();
        }
    }
}
