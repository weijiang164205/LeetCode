package com.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 * @version 1.0
 * @description:
 * @date 2023/3/11 15:14
 */
public class 括号生成 {
    public static void main(String[] args) {

    }

    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList();
        backtrack(list, new StringBuilder(), 0, 0, n);
        return list;
    }

    private void backtrack(List<String> list, StringBuilder cur, int open, int close, int n) {
        if (cur.length() == 2 * n) {
            list.add(cur.toString());
        } else {
            if (open < n) {
                cur.append("(");
                backtrack(list, new StringBuilder(), open + 1, close, n);
                cur.deleteCharAt(cur.length() - 1);
            }
            if (close < n) {
                cur.append(")");
                backtrack(list, new StringBuilder(), open, close + 1, n);
                cur.deleteCharAt(cur.length() - 1);
            }
        }
    }

}
