package array;

public class Subarrays {

    public static void main(String[] args) {
        int[] array = {1,2,3,4};

        for (int start = 0; start < array.length; start++){

            for (int end = start; end < array.length; end++){
                System.out.print("[");
                for (int k = start; k<= end; k++){
                    System.out.print(array[k]);
                    if (k < end) {
                        System.out.print(", ");
                    }
                }
                System.out.println("]");
            }
        }
    }
}