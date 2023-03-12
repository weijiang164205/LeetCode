package com.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Administrator
 * @version 1.0
 * @description:
 * @date 2023/3/9 20:49
 */
//        给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
//
//        你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
//
//        你可以按任意顺序返回答案。
public class 两数之和 {
    public static void main(String[] args) {
        int[] ints = twoSum(new int[]{1, 2, 3,4,5}, 7);
        System.out.println(Arrays.toString(ints));
    }
    public static  int[] twoSum(int[] nums, int target) {
//        int length = nums.length;

//        for (int j = 0; j < length; j++) {
//            for (int i = 1; i < length -j; i++) {
//                if (nums[i] + nums[i+1] == target){
//                    return new int[]{i,i+1};
//                }
//            }
//        }
//        return new int[0];


        int length = nums.length;
        Map<Integer,Integer> map = new HashMap<>(length);

        for (int i = 0; i < length; i++) {
            if (map.containsKey(target - nums[i])){
                return new int[]{map.get(target - nums[i]),i};
            }
            map.put(nums[i],i);
        }
        return new int[0];
    }
}
