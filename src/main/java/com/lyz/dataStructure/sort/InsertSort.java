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
public class InsertSort {

    public static void main(String[] args) {

        Random ran = new Random();
        int[] arr = new int[20];
        for (int i = 0; i < 20; i++) {
            arr[i] = ran.nextInt(100) + 1;
        }
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void sort(int[] arr){

        int i, tmp;
        for( i=1;i<arr.length;i++){  //从第二个数字开始循环，
            tmp =arr[i];
             int  j =i-1;
             while(j>=0&&arr[j]>tmp){
                 arr[j+1] = arr[j];
                j--;
             }
            arr[j+1]= tmp;
            System.out.println("第" + i + "次" + Arrays.toString(arr));
        }
    }
}
