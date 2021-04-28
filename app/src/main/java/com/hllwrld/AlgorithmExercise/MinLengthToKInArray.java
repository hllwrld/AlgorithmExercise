package com.hllwrld.AlgorithmExercise;

class MinLengthToKInArray {


    public static int getMinLength(int[] nums, int k) {
        int l = nums.length;
        int i =0;
        int j=-1;
        int sum =0;
        while (i<nums.length) {
            if (sum < k) {
                if (j == nums.length-1) {
                    break;
                }
                j++;
                sum = sum + nums[j];
            } else {
               l = Math.min(l, j-i+1);
               sum = sum - nums[i];
               i++;
            }
        }
        return l;

    }

    public static void main(String[] args) {
       int[] nums = new int[] {1,8,2,4,3,9,5};
      System.out.println("get value is:" + getMinLength(nums, 22));
    }
}
