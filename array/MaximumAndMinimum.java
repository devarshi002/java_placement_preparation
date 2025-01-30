package array;

public class MaximumAndMinimum {
    public static void main(String[] args) {
        int[] arr ={12,3,48,25,14,2,10};

        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Maximum element:" + max);
        System.out.println("Minimum element: "+min);
    }
}
