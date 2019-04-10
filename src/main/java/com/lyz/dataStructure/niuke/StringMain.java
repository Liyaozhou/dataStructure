package com.lyz.dataStructure.niuke;

import java.util.Scanner;

/**
 *@Author:759057893@qq.com Lyz
 *@Date: 2019/4/3 16:55
 *@Description:
 **/

/*

小Q最近遇到了一个难题：把一个字符串的大写字母放到字符串的后面，各个字符的相对位置不变，且不能申请额外的空间。
你能帮帮小Q吗？
 */


public class StringMain{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("请输入字符串：");
        while(input.hasNext()){
            String str = input.nextLine();
            char[] chars = str.toCharArray();
            int length = str.length();
            //冒泡排序
            for(int i=0;i<length-1;i++){
                for(int j = 0;j<length-i-1;j++){
                    //判断 如果前一个字符为大写，后一个字符为小写，就交换位置
                    if((chars[j]>='A'&&chars[j]<='Z')&&(chars[j+1]>'Z')){
                        char tmp = chars[j+1];
                        chars[j+1] = chars[j];
                        chars[j] = tmp;
                    }
                }
            }
            System.out.println(String.valueOf(chars)); //将数组装换为字符串
        }
    }
}




