package com.lyz.dataStructure.stack;

/**
 *@Author:759057893@qq.com Lyz
 *@Date: 2019/3/29 15:10
 *@Description:
 **/
public class TestQueue {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue(5);
        myQueue.insert(52);
        myQueue.insert(20);
        myQueue.insert(15);
        myQueue.insert(36);

        System.out.println("是否为空："+myQueue.isEmpty());
    }
}
