package array;

import java.util.Arrays;

public class Remove_element27 {
    
    public static int removeElement(int[] nums, int val){
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!= val) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
    
    public static void main(String[] args) {
     int[] nums = {3,2,2,3};
     int val = 3;
     int newLength = removeElement(nums, val);
     System.out.println("New length: "+ newLength);
     
     System.out.println("Modified array: "+ Arrays.toString(Arrays.copyOf(nums, newLength)));
    }
}
