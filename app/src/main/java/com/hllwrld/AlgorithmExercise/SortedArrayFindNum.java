package com.hllwrld.AlgorithmExercise;

class SortedArrayFindNum {


    public static int[] findNum(int[] nums, int k) {
        int i=0;
        int j=nums.length-1;
        while (i<j) {
            if (nums[i] + nums[j] > k) {
                j--;
            } else if (nums[i]+ nums[j] <k) {
                i++;
            } else {
                break;
            }
        }
       int [] ret= new int[2];
        ret[0] = i+1;
        ret[1] = j+1;
        return ret;
    }


    public static void main(String[] args) {

        int [] nums =  new int[]{1,2,5,7,13,15};
        int[] ret= findNum(nums, 9);
        System.out.println(ret[0]+","+ret[1]);
    }
}
