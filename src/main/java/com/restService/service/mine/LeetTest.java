package com.restService.service.mine;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by EDW on 4/6/2021.
 */
public class LeetTest {

    /*
        Input: l1 = [2,4,3], l2 = [5,6,4]
        Output: [7,0,8]
        Explanation: 342 + 465 = 807.
        Example 2:

        Input: l1 = [0], l2 = [0]
        Output: [0]
        Example 3:

        Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
        Output: [8,9,9,9,0,0,0,1]
     */

    public static void main(String args[]) {
        ListNode l1n3 = new ListNode(3);
        ListNode l1n2 = new ListNode(4, l1n3);
        ListNode l1n1 = new ListNode(2, l1n2);
        ListNode l2n3 = new ListNode(4);
        ListNode l2n2 = new ListNode(6, l2n3);
        ListNode l2n1 = new ListNode(5, l2n2);

        ListNode opNode1 = l1n1;
        while (opNode1.next != null) {

        }

    }

    public void twoSum() {
        int[] nums = new int[]{3, 3};
        int target = 6;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                System.out.println(map.get(complement) + " , " + i);
            }
            map.put(nums[i], i);
        }
    }

}
