package com.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Administrator
 * @version 1.0
 * @description:
 * @date 2023/3/11 13:48
 */
public class 电话号码的字母组合 {
    public static void main(String[] args) {

    }


    public List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<String>();
        if (digits.length() == 0) {
            return combinations;
        }
        Map<Character, String> phoneMap = new HashMap<Character, String>() {{
            put('2', "abc");
            put('3', "def");
            put('4', "ghi");
            put('5', "jkl");
            put('6', "mno");
            put('7', "pqrs");
            put('8', "tuv");
            put('9', "wxyz");
        }};
        StringBuilder combination = new StringBuilder();
        backtrack(combinations, phoneMap, digits, 0, combination);

        return combinations;
    }

    private void backtrack(List<String> combinations, Map<Character, String> phoneMap, String digits, int index, StringBuilder combination) {

        if (index == digits.length()) {
            combinations.add(combination.toString());
        } else {
            String str = phoneMap.get(digits.charAt(index));
            int len = str.length();
            for (int i = 0; i < len; i++) {
                combination.append(str.charAt(i));
                backtrack(combinations, phoneMap, digits, index + 1, combination);
                combination.deleteCharAt(index);
            }
        }


    }
}
