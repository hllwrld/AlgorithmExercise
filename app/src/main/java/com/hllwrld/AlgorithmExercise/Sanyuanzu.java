package com.hllwrld.AlgorithmExercise;

/*
给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有满足条件且不重复的三元组。

注意：答案中不可以包含重复的三元组。

示例：
给定数组 nums = [-1, 0, 1, 2, -1, -4]，满足要求的三元组集合为：
[
  [-1, 0, 1],
  [-1, -1, 2]
]

 */

import android.util.Pair;

import java.util.HashMap;
import java.util.Map;

public class Sanyuanzu {





    

    private static void printNums(int nums[]) {
        HashMap<Pair<Integer,Integer>, Integer> hashMap = new HashMap<>();
        for (int i=0;i<nums.length;i++) {
            for (int j=i+1;j<nums.length;j++) {
                hashMap.put(new Pair(i,j), nums[i]+nums[j]);
            }
        }

            for (Map.Entry<Pair<Integer, Integer>, Integer> entry : hashMap.entrySet()) {
                Pair<Integer,Integer> pair =entry.getKey();
                Integer value = entry.getValue();
                for (int i=0;i<nums.length;i++) {
                    if (i != pair.first && i != pair.second && nums[i] + value == 0) {
                        System.out.println(nums[i]+","+nums[pair.first]+","+nums[pair.second]);
                    }
                }

            }

/*
        int results[][] = new int[nums.length][nums.length];
        for (int i=0;i<nums.length;i++) {
            for (int j = i + 1; j < nums.length; j++) {
                results[i][j] = nums[i]+nums[j];
            }
        }
*/


    }




    public static void main(String[] args) {
        int nums[] =new int[] {-1, 0, 1, 2, -1, -4};
        printNums(nums);
    }
}
