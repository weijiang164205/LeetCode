package com.leetcode;

/**
 * @author Administrator
 * @version 1.0
 * @description:
 * @date 2023/3/11 12:59
 */
public class 最长回文子串 {
    public static void main(String[] args) {

    }

    public String longestPalindrome(String s) {
        int n = s.length();
        boolean dp[][] = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
        }
        int maxLen = 0;
        int start = 0;
        for (int L = 2; L < n; L++) {
            for (int i = 0; i < n; i++) {
                int j = L + i - 1;
                if (j > n) {
                    break;
                }
                if (s.charAt(i) != s.charAt(j)) {
                    dp[i][j] = false;
                } else {
                    if (j - i < 3) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = dp[i + 1][j - 1];
                    }
                }
                if (dp[i][j] && j - i + 1 > maxLen) {
                    maxLen = j - i + 1;
                    start = i;
                }

            }

        }

        return s.substring(start, start + maxLen);
    }
}
