package com.lyz.dataStructure.sort;

import java.util.Arrays;
import java.util.Random;

/**
 *@Author:759057893@qq.com Lyz
 *@Date: 2019/4/2 15:51
 *@Description:
 **/

/*
希尔排序
 */
public class ShellSort {

    public static void main(String[] args) {
        Random ran = new Random();
        int[] arr = new int[20];
        for (int i = 0; i < 20; i++) {
            arr[i] = ran.nextInt(100) + 1;
        }
        System.out.println(Arrays.toString(arr));
        shellsort(arr);
        System.out.println(Arrays.toString(arr));
    }


    public static void shellsort(int[] arr){
      int i,j,h;
      int tmp,r,x=0;
      for(r=arr.length/2;r>=1;){

      }

    }
}
