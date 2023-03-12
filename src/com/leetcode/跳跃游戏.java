package com.leetcode;

/**
 * @author Administrator
 * @version 1.0
 * @description:
 * @date 2023/3/11 21:05
 */
public class 跳跃游戏 {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 3, 1, 1, 4, 5};
        boolean b = canJump(nums);
        System.out.println(b);
    }

    public static boolean canJump(int[] nums) {
        int n = nums.length;
        int rightmost = 0;
        for (int i = 0; i < n; ++i) {
            if (i <= rightmost) {
                rightmost = Math.max(rightmost, i + nums[i]);
                if (rightmost >= n - 1) {
                    return true;
                }
            }
        }
        return false;
    }

}
