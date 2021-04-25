package com.hllwrld.AlgorithmExercise;

public class AddTwoLinkedNums {

    private static class Node {
        int mValue;
        public Node(int value) {
           mValue = value;
        }
        Node next;
    }

    /*
    输入：l1 = [2,4,3], l2 = [5,6,4]
输出：[7,0,8]
解释：342 + 465 = 807.
示例 2：

输入：l1 = [0], l2 = [0]
输出：[0]
示例 3：

输入：l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
输出：[8,9,9,9,0,0,0,1]

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/add-two-numbers
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    private static Node init(int[] nums) {
        Node head =new Node(nums[0]);
        Node ptr = head;
        for (int i=1;i<nums.length;i++) {
           ptr.next = new Node(nums[i]);
           ptr = ptr.next;
        }
        return head;
    }

    private static Node reverseList(Node list) {
        Node cur = list;
        Node pre = null;
        while(cur != null) {
           Node nextNode = cur.next;
           pre = cur;
           cur.next = pre;
           cur = nextNode;
        }
        return pre;
    }

    private static void combineTowList(Node list1, Node list2) {
        list1 = reverseList(list1);
        list2 = reverseList(list2);
        int temp = 0;
        Node ptr1 = list1;
        Node ptr2 = list2;
        while (ptr1.next!= null && ptr2.next!= null) {
            int sum  =temp + ptr1.mValue + ptr2.mValue >=10;
            if (sum >=10) {
                temp = 1;
            }
            ptr1.mValue = (temp + ptr1.mValue + ptr2.mValue) % 10;
        }

        if (ptr1.next == null) {
            ptr1.next = ptr2.next;
        }

    }

    public static void main(String[] args) {
        Node list1 = init(new int[]{2,4,3});
        Node list2 = init(new int[]{5,6,4});
    }

}
