package com.leetcode;

/**
 * @author Administrator
 * @version 1.0
 * @description:
 * @date 2023/3/11 17:32
 */
public class 搜索旋转排序数组 {
    public static void main(String[] args) {

        int[] nums = new int[]{4, 5, 6, 7, 0, 1, 2};
        int search = search(nums, 0);
        System.out.println(search);
    }

    public static int search(int[] nums, int target) {
        int len = nums.length;
        if (len == 0) {
            return -1;
        }
        if (len == 1) {
            return nums[0] == target ? 0 : -1;
        }

        int l = 0;
        int r = len - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (nums[mid] == target) {
                return mid;
            }

            if (nums[0] <= nums[mid]) {
                if (nums[0] <= target && target < nums[mid]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            } else {
                if (target > nums[mid] && target <= nums[r]) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }

        }
        return -1;
    }
    

}
