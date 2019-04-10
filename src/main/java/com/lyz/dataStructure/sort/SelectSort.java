package com.lyz.dataStructure.sort;/**
 * @Author:759057893@qq.com Lyz
 * @Date: ${Date} 17:57
 * @Description:
 **/

import java.util.Arrays;
import java.util.Random;

/**
 *@Author:759057893@qq.com Lyz
 *@Date: 2019/3/28 17:57
 *@Description:
 **/

/*
选择排序
 */
public class SelectSort {
    public static void main(String[] args) {
        Random ran = new Random();
        int arr[] = new int[20];
        for(int i= 0 ; i<20;i++){
            arr[i] = ran.nextInt(100)+1;
        }
        System.out.println(Arrays.toString(arr));

        SelectSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }


    public static void sort(int[] arr){
        int mixindex = 0;
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            mixindex = i;//假设最小元素的下标
            int j;
            for (j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[mixindex]) {
                    mixindex = j;
                }
            }
            if (mixindex != i) {
                temp = arr[i];
                arr[i] = arr[mixindex];
                arr[mixindex] = temp;
            }
            System.out.println("第" + i + "次" + Arrays.toString(arr));
        }
    }
}
