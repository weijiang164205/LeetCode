package com.leetcode;

/**
 * @author Administrator
 * @version 1.0
 * @description:
 * @date 2023/3/12 21:56
 */
public class 颜色分类 {
    public static void main(String[] args) {

    }

    public void sortColors(int[] nums) {
        int p0 = 0;
        int p2 = nums.length - 1;

        for (int i = 0; i < p2; i++) {
            while (i <= p2 && nums[i] == 2) {
                int tmp = nums[i];
                nums[i] = nums[p2];
                nums[p2] = tmp;
                --p2;
            }
            if (nums[i] == 0) {
                int tmp = nums[i];
                nums[i] = nums[p0];
                nums[p0] = tmp;
                ++p0;
            }
        }

    }
}
