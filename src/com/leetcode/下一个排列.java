package com.leetcode;

/**
 * @author Administrator
 * @version 1.0
 * @description:
 * @date 2023/3/11 16:23
 */
public class 下一个排列 {
    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        int j = nums.length - 1;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        if (i >= 0) {
            while (nums[i] >= nums[j]) {
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i);

    }

    public void swap(int[] nums, int left, int right) {
        int tmp = nums[left];
        nums[left] = nums[right];
        nums[right] = tmp;
    }

    public void reverse(int[] nums, int start) {
        int right = nums.length - 1;
        int left = start + 1;
        while (left < right) {
            swap(nums, left, right);
            left++;
            right--;
        }
    }

}
