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
           cur.next = pre;
           pre = cur;
           cur = nextNode;
        }
        return pre;
    }

    private static Node combineTowList(Node list1, Node list2) {
        Node head1 = reverseList(list1);
        printList(head1);
        Node head2= reverseList(list2);
        printList(head2);
        int temp = 0;
        Node ptr1 = head1;
        Node ptr2 = head2;
        Node pre = ptr1;
        while (ptr1 != null && ptr2 != null) {
            int sum  =temp + ptr1.mValue + ptr2.mValue ;
            ptr1.mValue = sum % 10;
            if (sum >=10) {
                temp = 1;
            } else {
                temp = 0;
            }
            pre = ptr1;
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }

        if (ptr1 == null) {
            pre.next = ptr2;
        }
        return reverseList(head1);

    }

    private static void printList(Node head) {
        System.out.println("---------------------------");
        Node cur = head;
        while (cur != null) {
           System.out.print(cur.mValue + ",");
           cur = cur.next;
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Node list1 = init(new int[]{2,4,3, 9, 8});
        Node list2 = init(new int[]{5,6,4});
        System.out.println("list1 is :");
        printList(list1);
        System.out.println();
        System.out.println("list2 is :");
        printList(list2);


        System.out.println();
        System.out.println("combined list is:");
        printList(combineTowList(list1, list2));


    }

}
