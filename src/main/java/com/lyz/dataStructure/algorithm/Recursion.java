package com.lyz.dataStructure.algorithm;

import java.util.Scanner;

/**
 *@Author:759057893@qq.com Lyz
 *@Date: 2019/4/1 15:27
 *@Description:
 **/

/*
递推算法   求n的阶乘
 */
public class Recursion {
    public static void main(String[] args) {
        int i;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入要求阶乘的一个整数");
         i = input.nextInt();
        Recursion rd = new Recursion();
        System.out.println(i+"的阶乘结果为："+rd.fact(i));
    }


    public long fact(int n){
        if(n<=1){
            return  1;
        }else{
            return fact(n-1)*n;
        }
    }
}
