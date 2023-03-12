package com.leetcode;

/**
 * @author Administrator
 * @version 1.0
 * @description:
 * @date 2023/3/11 21:02
 */
public class 最大子数组和 {
    public int maxSubArray(int[] nums) {
        int prev = 0;
        int max = nums[0];

        for (int num : nums) {
            prev = Math.max(prev + num, num);
            max = Math.max(max, prev);
        }
        return max;
    }
}
