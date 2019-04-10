package com.lyz.dataStructure.array;

import java.util.Random;
import java.util.Scanner;

/**
 *@Author:759057893@qq.com Lyz
 *@Date: 2019/3/28 20:45
 *@Description:
 **/

/*
给定nums = [2,7,11,15]，目标= 9

因为nums [ 0 ] + nums [ 1 ] = 2 + 7 = 9
所以返回[ 0,1 ]
 */
public class Solution {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
                 int x =scan.nextInt();
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) {
                System.out.println("-1");
            }
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) {
                System.out.println("0");
            }
            rev = rev * 10 + pop;
        }
        System.out.println(rev);
    }
}











