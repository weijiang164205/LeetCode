package com.leetcode;

import java.util.Stack;

/**
 * @author Administrator
 * @version 1.0
 * @description:
 * @date 2023/3/9 20:29
 */
//给你一个长度为 n 下标从 0 开始的字符串 blocks ，blocks[i] 要么是 'W' 要么是 'B' ，表示第 i 块的颜色。字符 'W' 和 'B' 分别表示白色和黑色。
//
//        给你一个整数 k ，表示想要 连续 黑色块的数目。
//
//        每一次操作中，你可以选择一个白色块将它 涂成 黑色块。
//
//        请你返回至少出现 一次 连续 k 个黑色块的 最少 操作次数
//    https://leetcode.cn/problems/minimum-recolors-to-get-k-consecutive-black-blocks/
public class DiDiTest {
    public static void main(String[] args) {
        int count = minimumRecolors("WBBWWBBWBW", 7);
        System.out.println(count);
    }
    public static int minimumRecolors(String blocks, int k) {
        int l = 0, r = 0, cnt = 0;
        while (r<k){
            cnt+=blocks.charAt(r) == 'W' ? 1:0;
            r ++;
        }
        int res = cnt;
        while (r<blocks.length()){
            cnt += blocks.charAt(r) == 'W' ? 1 :0;
            cnt -= blocks.charAt(l) == 'W' ? 1 : 0;
            l++;
            r++;
            Math.min(res, cnt);
        }


        return res;
    }
}
