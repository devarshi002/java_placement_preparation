package array;

import java.util.ArrayList;

public class Even_odd_count {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        // int evenCount = 0;
        // int oddCount = 0;

        ArrayList<Integer> evenNumbers = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();
        

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenNumbers.add(arr[i]);
            }
            else{
                oddNumbers.add(arr[i]);
            }
        }
        System.out.println("Number of even counts: " + evenNumbers);
        System.out.println("Number of odd count: " + oddNumbers);
    }
}
