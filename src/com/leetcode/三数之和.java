package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Administrator
 * @version 1.0
 * @description:
 * @date 2023/3/10 21:57
 */
public class 三数之和 {

    public static void main(String[] args) {

    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        int len = nums.length;
        for (int first = 0; first < len; ++first) {
            if (first > 0 && nums[first] == nums[first + 1]) {
                continue;
            }
            int third = len - 1;
            int target = -nums[first];

            for (int second = first + 1; second < len; second++) {
                if (second > first + 1 && nums[second] == nums[second + 1]) {
                    continue;
                }
                if (nums[third] + nums[second] > target) {
                    --third;
                }
                if (second == third) {
                    break;
                }
                if (nums[second] + nums[third] == target) {
                    List<Integer> na = new ArrayList<>();
                    na.add(first);
                    na.add(second);
                    na.add(third);
                    list.add(na);
                }


            }

        }


        return list;

    }

}
