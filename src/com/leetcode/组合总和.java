package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Administrator
 * @version 1.0
 * @description:
 * @date 2023/3/11 18:35
 */
public class 组合总和 {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 3, 6, 7};

        List<List<Integer>> lists = combinationSum(nums, 7);
        System.out.println(Arrays.toString(lists.toArray()));

    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        back(list, candidates, target, list1, 0);
        return list;
    }

    private static void back(List<List<Integer>> list, int[] candidates, int target, List<Integer> list1, int idx) {

        if (idx == candidates.length) {
            return;
        }
        if (target == 0) {
            list.add(new ArrayList<Integer>(list1));
            return;
        }
        back(list, candidates, target, list1, idx + 1);
        if (target - candidates[idx] >= 0) {
            list1.add(candidates[idx]);
            back(list, candidates, target - candidates[idx], list1, idx);
            list1.remove(list1.size() - 1);
        }

    }


}
