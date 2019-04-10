package com.lyz.dataStructure.sort;

import java.util.Arrays;
import java.util.Random;

/**
 *@Author:759057893@qq.com Lyz
 *@Date: 2019/4/5 14:04
 *@Description:
 **/
public class QuicklySort {

    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[10];
        for(int i=0;i<10;i++){
            arr[i] = random.nextInt(50)+1;
        }
        System.out.println("排序前："+Arrays.toString(arr));
        quickSort(arr,0,arr.length-1);
        System.out.println("排序后："+Arrays.toString(arr));

    }

    private static void quickSort(int[] arr,int left,int right){
       if(arr==null||arr.length<2||left>right){
           return;
       }
       int l = left;
       int r = right;
       int key = arr[left]; //以第一个数作为基准
        while(l<r){
            while(l<r&&arr[r]>=key){
                r--;
            }
            arr[l] = arr[r];
            while(l<r&&arr[l]<=key){
                l++;
            }
            arr[r] = arr[l];
        }
        arr[l] = key;
        quickSort(arr,left,l-1);
        quickSort(arr,l+1,right);
    }
}
