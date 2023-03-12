package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Administrator
 * @version 1.0
 * @description:
 * @date 2023/3/11 18:03
 */
public class 在排序数组中查找元素的第一个和最后一个位置 {
    public static void main(String[] args) {
        int[] nums = new int[]{5, 7, 7, 8, 8, 10};
        int[] extracted = extracted(nums);
        System.out.println(Arrays.toString(extracted));

    }

    private static int[] extracted(int[] nums) {
        int leftIndex = searchRange(nums, 8);

        int bigIndex = searchRange(nums, 9);

        return new int[]{leftIndex, bigIndex - 1};
    }

    public static int searchRange(int[] nums, int target) {
        int len = nums.length;
        int l = 0;
        int r = len - 1;
        List<Integer> list = new ArrayList<>();
        while (l <= r) {
            int mid = (l + r) / 2;
            if (nums[mid] == target) {
                list.add(mid);
            }
            if (nums[mid] >= target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;

    }

}
