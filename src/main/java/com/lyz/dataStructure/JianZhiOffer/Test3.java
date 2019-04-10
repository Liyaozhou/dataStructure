package com.lyz.dataStructure.JianZhiOffer;


import java.util.Scanner;

/**
 *@Author:759057893@qq.com Lyz
 *@Date: 2019/4/7 17:54
 *@Description:
 **/
public class Test3 {

    public static String replaceSpace(StringBuffer str) {
        if(str==null){
            return null;
        }
        StringBuffer newStr = new StringBuffer();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                newStr.append('%');
                newStr.append('2');
                newStr.append('0');
            }else{
                newStr.append(str.charAt(i));
            }
        }
        return newStr.toString();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入字符串：");
        while(input.hasNext()){
            String str = input.nextLine();
            StringBuffer s = new StringBuffer(str);
            System.out.println("输出字符为：");
            System.out.println( replaceSpace(s));
        }

    }
}
