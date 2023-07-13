//Rotate an array of n elements to the right by k steps. e.g n=7 and k=3,
// the array[1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4]

import java.sql.SQLOutput;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
    }
    public void rotate(int[] nums, int k) {

        if(k>nums.length)
            k=k%nums.length;

        int [] result = new int[nums.length];
        for(int i=0; i < k; i++){
            result[i] = nums[nums.length-k+i];
        }
        int j=0;
        for(int i=k; i<nums.length; i++){
            result[i] = nums[j];
            j++;
        }
        System.arraycopy(result, 0, nums,0, nums.length);

    }

}

