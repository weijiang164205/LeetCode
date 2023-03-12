package com.leetcode;

public class 旋转图像 {
    public static void main(String[] args) {


    }

    public void rotate(int[][] matrix) {
        int len = matrix.length;
        int[][] tmp = new int[len][len];
        for (int n = 0; n < len; ++n) {
            for (int j = 0; j < n; ++j) {
                tmp[j][len - n - 1] = matrix[n][j];
            }
        }

        for (int n = 0; n < len; ++n) {
            for (int j = 0; j < n; ++j) {
                tmp[n][j] = matrix[n][j];
            }
        }
    }

}
