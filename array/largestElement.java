package array;

public class largestElement {
    public static void main(String[] args) {
        int[] arr = {10,20,5,40,30};
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Largest element is: " + max);
    }
}
