package com.lyz.dataStructure.sort;/**
 * @Author:759057893@qq.com Lyz
 * @Date: ${Date} 17:58
 * @Description:
 **/

import java.util.Arrays;
import java.util.Random;

/**
 *@Author:759057893@qq.com Lyz
 *@Date: 2019/3/28 17:58
 *@Description:
 **/

/*
    冒泡排序
 */
public class BubblingSort {

    public static void main(String[] args) {
        Random ran = new Random();
        int arr[] = new int[20];
        for (int i = 0; i < 20; i++) {
            arr[i] = ran.nextInt(50) + 1;
        }
        System.out.println(Arrays.toString(arr));

        int mub;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    mub = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = mub;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
