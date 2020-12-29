package com.hllwrld.AlgorithmExercise;

class ColorSort {

    /*
    给定一个包含红色、白色和蓝色，一共 n 个元素的数组，原地对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。

此题中，我们使用整数 0、 1 和 2 分别表示红色、白色和蓝色。

 

进阶：

你可以不使用代码库中的排序函数来解决这道题吗？
你能想出一个仅使用常数空间的一趟扫描算法吗？
 

示例 1：

输入：nums = [2,0,2,1,1,0]
输出：[0,0,1,1,2,2]
示例 2：

输入：nums = [2,0,1]
输出：[0,1,2]
示例 3：

输入：nums = [0]
输出：[0]
示例 4：

输入：nums = [1]
输出：[1]

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/sort-colors
     */


    static int nums1[] = {2, 0, 2, 1, 1, 0};
    static int nums2[] = {2, 0, 1};
    static int nums3[] = {0};
    static int nums4[] = {1};

    public static void sort(int nums[]) {
        int l = 0;
        int r = nums.length - 1;
        int i = 0;
        while (i <= r) {
            if (nums[i] == 2) {
                swap(nums, i, r--);
                continue;
            }
            if (nums[i] ==0 && i < l)  {
                i ++;
                continue;
            }
            if (nums[i] == 0) {
                swap(nums, i, l++);
                continue;
            }
            i++;
        }
    }

    private static void swap(int nums[], int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


    public static void test() {
        sort(nums4);
        Utils.INSTANCE.printIntArray(nums4);

    }


}
