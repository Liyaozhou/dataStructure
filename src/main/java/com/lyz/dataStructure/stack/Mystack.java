package com.lyz.dataStructure.stack;

/**
 *@Author:759057893@qq.com Lyz
 *@Date: 2019/3/29 10:36
 *@Description:
 **/

/*
栈 先进后出
 */

 /*
 4      * 用数组实现栈  先进后出，后进先出
 5      * 思路：定义一个数组，用来保存入栈的数据，数组初始化大小为10
 6      *     用size表示入栈数据的个数 而size-1则是对应的数组下标
 7      *     （由于是数组，需要考虑扩容的问题）
 8      *     入栈时，需要判断数据个数是否超出数组大小，如果超出 使用Arrays.copyOf(,)来扩容
 9      *
10      *     出栈时，则直接获取栈顶数据，即根据size-1获取后进的数据元素的数组下标，然后将对应出栈
11      *     的数据元素的数组下标处置空。
12      *
13      */
public class Mystack {
    //底层实现是一个数组
    private int [] arr;
    private int top;

    public Mystack(){
        arr= new int[10];
        top = -1;
    }

     public Mystack(int maxsize){
        arr = new int[maxsize];
        top = -1;
     }
    //入栈
     public void push (int value){
        arr[++top] =value;
     }

     //出栈
     public int pop(){
         return arr[top--];
     }
     /*
     查看数据
      */

    public int peek(){
        for(int i =0; i<arr.length-1; i++){
            System.out.print( arr[i]+",");
        }

        return arr[top];
    }

     /*
     判断是否为空
      */
     public boolean isEmpty(){
         return  top == -1;
     }
    /*
    判断是否满了
     */
    public boolean isFull(){
        return  top == arr.length-1;
    }


}
