package com.lyz.dataStructure.algorithm;

import java.util.Scanner;

/**
 *@Author:759057893@qq.com Lyz
 *@Date: 2019/4/2 11:04
 *@Description:
 **/

/*
递推法：
如果一对两个月大的兔子以后每一个月都可以生一对小兔子，
而一对新生的兔子出生两个月后才可以生小兔子。也就是说，
1月份出生，3月份才可产仔。那么假定一年内没有发生兔子死亡事件，那么2年后共有多少对兔子？
 */
public class Recurrence {
    public static void main(String[] args) {
        Recurrence r = new Recurrence();
        Scanner input = new Scanner(System.in);
        System.out.println("递推算法求解兔子产仔问题");
        System.out.println("请输入月份：");
        int n = input.nextInt();
        int num = r.fibonacci(n);
        if(n<0) {
            System.out.println("输入时间不能小于等于0");
        }else{
            System.out.println("经过"+n+"月时间的繁殖,总共繁殖出"+num+"对兔子！");
        }

    }

    public int fibonacci(int n){
        int t1,t2;
        if(n<0){
            return -1;
        } else if(n==1||n==2){
            return 1;
        }else{
            t1 = fibonacci(n-1);
            t2 = fibonacci(n-2);  //递归调用
            return t1+t2;
        }
    }
}
