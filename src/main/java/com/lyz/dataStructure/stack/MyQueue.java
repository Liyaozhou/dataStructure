package com.lyz.dataStructure.stack;

/**
 *@Author:759057893@qq.com Lyz
 *@Date: 2019/3/29 11:30
 *@Description:
 **/
public class MyQueue {
    //底层使用数组
    private int[] arr;
    //有效数据的大小
    private int elements;
    //队头
    private int front;
    //队尾
    private int end ;

    public MyQueue(){
        arr= new int[10];
        elements = 0;
        front =0;
        end = -1;
    }
    /*
    带参构造器，参数为数组大小
     */
    public MyQueue(int maxsize){
        arr= new int[maxsize];
        elements = 0;
        front =0;
        end = -1;
    }

    /*
    添加数据，从队尾添加
     */
    public void insert(int value){
        arr[++end] = value;
        elements ++;
    }
    /*
    删除数据，从队头删除
     */
    public int delete(int value){
       elements--;
       return  arr[front--];
    }
     /*
     查看数据
      */

    public int peek(){
        for(int i =0; i<arr.length-1; i++){
            System.out.print( arr[i]+",");
        }

        return arr[elements];
    }

    /*
    判断是否为空
     */
    public boolean isEmpty(){
        return  elements ==0;
    }
    /*
    判断是否满了
     */
    public boolean isFull(){
        return  elements ==arr.length;
    }
}
