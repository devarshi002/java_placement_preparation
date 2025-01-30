package array;

import java.util.Arrays;
import java.util.Scanner;

public class ElementIndex {
    public static void main(String[] args) {
        int[] arr = {5,10,15,20,25,30,35,40,45,50};
        System.out.println("Our array is: " + Arrays.toString(arr));

        Scanner sc = new Scanner(System.in);
        int kye = sc.nextInt();

        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == kye) {
                index = i;  // store index
                System.out.println("Element is found "+ index);
                break;
            }
            else {
                System.out.println("Element not found in the array");
            }
        }
        sc.close();
    }
}
