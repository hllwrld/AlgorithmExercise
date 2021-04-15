package com.hllwrld.AlgorithmExercise;

public class SortZero {




    public static void sortArray(int nums[]) {
        int i = nums.length -1;
        for (int j=nums.length-1;j>=0;j--) {
           if (nums[j] != 0) {
               nums[i] = nums[j];
               i--;
           }
        }
        for (int j=i;j>=0;j--) {
            nums[j] = 0;
        }
    }



    public static void main(String[] args) {

        int[] nums = new int[]{0,1,0,2,0,3,12,4,0,5,0,0};
        sortArray(nums);
        for (int num : nums) {
            System.out.print(num+",");
        }
    }
}
