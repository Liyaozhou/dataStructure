package com.lyz.dataStructure.niuke;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //定义用户数量
        System.out.println("请输入一个整数代表怪兽的只数：");
        int n = scanner.nextInt();
        System.out.println("请输入n个整数，代表武力值：");
        int[] s = new int[n];
        for (int i = 0; i < s.length; i++) {
            s[i] = scanner.nextInt();
        }
        System.out.println("请输入n个整数,代表收买n只怪兽所需要的金币数：");
        int q = scanner.nextInt();
        for (int j = 0; j < s.length; j++) {
            s[j] = scanner.nextInt();
        }


    }
}

