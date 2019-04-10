package com.lyz.dataStructure.niuke;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *@Author:759057893@qq.com Lyz
 *@Date: 2019/4/3 19:26
 *@Description:
 **/
public class StringDemo {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("输入字符串:");
            String str = input.nextLine();

            System.out.println(stringLength(str));
    }

    public static int stringLength(String string) {

        int len = string.length();
        int max = 0;
        if (len > 0) {
            Map<Character, Integer> map = new HashMap<Character, Integer>();
            map.put(string.charAt(0), 0);
            int[] lengthAt = new int[string.length()];
            lengthAt[0] = 1;
            for (int i = 1; i < len; i++) {
                char c = string.charAt(i);
                if (map.containsKey(c)) {
                    lengthAt[i] = Math.min(lengthAt[i - 1] + 1, i - map.get(c));
                } else {
                    lengthAt[i] = lengthAt[i - 1] + 1;
                }
                max = Math.max(max, lengthAt[i]);
                map.put(c, i);
            }
            for (int i = 0; i < len; i++) {
                if (max == lengthAt[i]) {

                }
            }

        }
        return max;
    }

}
