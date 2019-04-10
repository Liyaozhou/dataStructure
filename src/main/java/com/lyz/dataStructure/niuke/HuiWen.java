package com.lyz.dataStructure.niuke;

import java.util.Scanner;

/**
 *@Author:759057893@qq.com Lyz
 *@Date: 2019/4/2 22:07
 *@Description:
 **/

/*
解题思路：
  （1）把字符串旋转形成另外一个字符串，称为旋转字符串；
  （2）求原字符串s1与旋转字符串s2中，最长公共子串的长度；
  （3）删除的字符数目 = 原字符串的长度 - 最长公共子串的长度。
需要解决的子问题：
   求两个字符串s1和s2中最长公共子串的长度。
   子问题的求解方式：动态规划
     设 MaxLen(i,j)表示s1左边i个字符与s2左边j个字符的最长公共子串长度，则子问题的解为MaxLen(strlen(s1),strlen(s2));
     MaxLen(i,j)的求解方式为：
       若s1第i个字符与s2第j个字符相匹配，则 return 1+MaxLen(i-1,j-1);
       否则：return max(MaxLen(i-1,j),MaxLen(i,j-1))
    边界条件：
    MaxLen(i,n)=0; for n in 0 to strlen(s2)
    MaxLen(n,j)=0; for n in 0 to strlen(s1)
*/
public class HuiWen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入字符串：");
        while (input.hasNext()) {
            String s1 = input.next();
            //求反转之后的字符串
            String s2 = new StringBuilder(s1).reverse().toString();
            //定义一个二维数组，然后遍历，求出最长公共子串
            int[][] dp = new int[s1.length() + 1][s2.length() + 1];

            for (int i = 1; i < dp.length; i ++ ) {
                for (int j = 1; j < dp.length; j ++ ) {
                    //如果i行的下标和j行的下标一样
                    if(s1.charAt(i - 1) == s2.charAt(j - 1)){
                        dp[i][j]=dp[i - 1][j - 1] + 1;
                    }else{
                        dp[i][j]= Math.max(dp[i - 1][j], dp[i][j - 1]);
                    }
                }
            }
            System.out.println(s1.length() - dp[s1.length()][s2.length()]);
        }
    }
}





