package com.hllwrld.AlgorithmExercise;

public class CirclePrint {


    private static void circlePrint(int[][] nums, int startNum, int xEnd, int yEnd) {

        for (int i = startNum; i < xEnd; i++) {
            print(nums[startNum][i]);
        }
        for (int i = startNum+1; i < yEnd; i++) {
            print(nums[i][xEnd - 1]);
        }
        for (int i = xEnd - 2; i >= startNum; i--) {
            print(nums[yEnd - 1][i]);
        }
        for (int i = yEnd - 2; i >= startNum+1; i--) {
            print(nums[i][startNum]);
        }

        if (xEnd > 1 && yEnd > 1) {
            circlePrint(nums, startNum + 1, xEnd - 1, yEnd - 1);
        }
    }

    private static void print(int number) {
        System.out.print(number + ",");
    }

    private static int[][] nums = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

    public static void main(String[] args) {
        circlePrint(nums,0, nums[0].length,nums.length);

    }
}
