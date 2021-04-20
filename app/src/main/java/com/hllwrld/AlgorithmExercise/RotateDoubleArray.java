package com.hllwrld.AlgorithmExercise;

class RotateDoubleArray {


    //    int [] nums = new int[]{1,2,3,4,5,6,7,8,9,10,11,12};
    static int[][] nums = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};


    private static int[][] rotateDoubleArray(int[][] nums) {
        int m = nums[0].length;
        int n = nums.length;
        int[][] ret = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ret[j][i] = nums[n - 1 - i][j];
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        int[][] ret = rotateDoubleArray(nums);
        for (int j = 0; j < ret.length; j++) {
            for (int i = 0; i < ret[0].length; i++) {
                System.out.print(ret[j][i] + ",");
            }
            System.out.println("");
        }

    }


}
