package com.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 * @version 1.0
 * @description:
 * @date 2023/3/11 19:53
 */

public class 全排列 {

    public List<List<Integer>> permute(int[] nums) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> all = new ArrayList<>();
        boolean[] uesd = new boolean[nums.length];
        backtrack(all, nums, list, 0, uesd);
        return all;
    }

    private void backtrack(List<List<Integer>> all, int[] nums, List<Integer> list, int index, boolean[] uesd) {
        if (index == nums.length) {
            all.add(new ArrayList<>(list));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!uesd[i]) {
                list.add(nums[i]);
                uesd[i] = true;
                backtrack(all, nums, list, i + 1, uesd);
                list.remove(list.size() - 1);
            } else {
                uesd[i] = false;
            }


        }

    }
}
