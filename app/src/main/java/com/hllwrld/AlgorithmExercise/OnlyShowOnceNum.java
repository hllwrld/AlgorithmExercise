package com.hllwrld.AlgorithmExercise;

class OnlyShowOnceNum {


    static int[] nums = new int[]{2,2,1};
    static int[] nums1 = new int[]{-4,1,2,2,1};


    static int getOnlyShowOnceNum(int nums[]) {
        int ret = 0;
        for (int i=0;i<nums.length;i++) {

            if (i %2== 0) {
                ret += nums[i];
            } else {
                ret -= nums[i];
            }
        }

        for (int i=0;i<nums.length;i++) {
            if (Math.abs(ret) == Math.abs(nums[i])) {
                return nums[i];
            }
        }
        return 0;
    }

    public static void main(String[] args) {

        System.out.println(getOnlyShowOnceNum(nums1));
    }
}
