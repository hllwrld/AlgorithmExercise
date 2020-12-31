package com.hllwrld.AlgorithmExercise;

class SubSortLcci {

    /*
    给定一个整数数组，编写一个函数，找出索引m和n，只要将索引区间[m,n]的元素排好序，整个数组就是有序的。注意：n-m尽量最小，也就是说，找出符合条件的最短序列。函数返回值为[m,n]，若不存在这样的m和n（例如整个数组是有序的），请返回[-1,-1]。

示例：

输入： [1,2,4,7,10,11,7,12,6,7,16,18,19]
输出： [3,9]
提示：

0 <= len(array) <= 1000000

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/sub-sort-lcci
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    public static int[] solve(int[] numbers) {
        int[] res = new int[2];

        int max = Integer.MIN_VALUE;
        int r = 0;
        int min = Integer.MAX_VALUE;
        int l = 0;
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] >= max) {
                max = numbers[i];
            } else {
                r = i;
            }

        }

        for (int i = numbers.length - 1; i >= 0; i--) {
            if (numbers[i] <= min) {
                min = numbers[i];
            } else {
                l = i;
            }
        }


        res[0] = l;
        res[1] = r;

        return res;
    }

    public static void test() {

        int[] array = new int[]{1,2,4,7,10,11,7,12,6,7,16,18,19};
        int[] ret = solve(array);
        Utils.INSTANCE.printIntArray(ret);
    }

}
