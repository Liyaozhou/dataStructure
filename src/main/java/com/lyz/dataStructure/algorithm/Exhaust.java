package com.lyz.dataStructure.algorithm;

import java.util.Scanner;

/**
 *@Author:759057893@qq.com Lyz
 *@Date: 2019/4/2 10:36
 *@Description:
 **/

/*
今有鸡兔同笼，上有三十五头，下有九十四足，问鸡兔各几何？
 */
public class Exhaust {

    static int chichen,habbit; //鸡，兔

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Exhaust e = new Exhaust();
        System.out.println("穷举法求解鸡兔同笼问题");
        int head,foot,re;
        System.out.println("请输入头数：");
        head= input.nextInt();
        System.out.println("请输入脚数：");
        foot= input.nextInt();
        re = e.qiongju(head,foot);
        if(re==1){
            System.out.println("鸡有"+chichen+"只,兔有"+habbit+"只");
        }    else{
            System.out.println("无法求解");
        }
    }


    public int qiongju(int head,int foot){
            int i,j,re=0;
            for( i =0;i<=head;i++){
                j=head-i;
                if(2*i+4*j==foot){
                    re =1;
                    chichen = i;
                    habbit = j;

                }
            }
            return  re;
    }
}
