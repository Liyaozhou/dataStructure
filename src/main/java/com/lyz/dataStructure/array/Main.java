package com.lyz.dataStructure.array;/**
 * @Author:759057893@qq.com Lyz
 * @Date: ${Date} 20:04
 * @Description:
 **/

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        int count = 0;
        while (i != 0) {
            i &= i - 1;
            count++;
        }
        System.out.println(count);
    }
}
