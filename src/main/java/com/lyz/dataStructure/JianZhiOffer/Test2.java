package com.lyz.dataStructure.JianZhiOffer;

import java.util.Arrays;
import java.util.Scanner;

/**
 *@Author:759057893@qq.com Lyz
 *@Date: 2019/4/3 21:57
 *@Description:
 **/
public class Test2 {
    /**
     * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
     * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
     * <p/>
     * 规律：首先选取数组中右上角的数字。如果该数字等于要查找的数字，查找过程结束：
     * 如果该数字大于要查找的数字，剔除这个数字所在的列：如果该数字小于要查找的数字，剔除这个数字所在的行。
     * 也就是说如果要查找的数字不在数组的右上角，则每－次都在数组的查找范围中剔除）行或者一列，这样每一步都可以缩小
     * 查找的范围，直到找到要查找的数字，或者查找范围为空。
     *
     * @param array 待查找的数组
     * @param target 要查找的数
     * @return 查找结果，true找到，false没有找到
     */

    public static boolean Find(int target, int [][] array) {
        if(array==null||array.length<1||array[0].length<1){
            return  false;
        }
        int rows = array.length;  //数组的行数
        int cols = array[1].length;  //数组行的列数

        int row =0;     //起始开始的行号
        int col =cols-1; //起始开始的列号

        //要查找的位置确定在数组之内
        while(row>=0&&row<rows&&col>=0&&col<cols){
            if(array[row][col]==target){
                return  true;
            }else if(array[row][col]>target){
                col--;
            }else{
                row++;
            }
        }
        return  false;
    }

    public static void main(String[] args) {
       int[][] array = {{1,2,8,9},
                        {3,6,10,15},
                        {5,7,12,16},
                        {11,18,20,25}
                        };
        System.out.println(Find(7,array));
        System.out.println(Find(15,array));
        System.out.println(Find(20,array));
        System.out.println(Find(26,array));

    }
}


