package array;

public class SmallestElement {
    public static void main(String[] args) {
        int[] arr = {47, 54, 3, 2, 65};
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min= arr[i];
            }
        }
        System.out.println("Smallest element in array is: " + min);
    }
}
