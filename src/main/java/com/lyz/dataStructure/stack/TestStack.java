package com.lyz.dataStructure.stack;/**
 * @Author:759057893@qq.com Lyz
 * @Date: ${Date} 10:59
 * @Description:
 **/


/**
 *@Author:759057893@qq.com Lyz
 *@Date: 2019/3/29 10:59
 *@Description:
 **/

/*
栈 先进后出
 */
public class TestStack {
    public static void main(String[] args) {
        Mystack myStack = new Mystack(5);
        myStack.push(5);
        myStack.push(16);
        myStack.push(81);
        myStack.push(25);
        myStack.push(90);
        System.out.println("是否为空："+myStack.isEmpty());
        System.out.println("是否满了："+myStack.isFull());
        System.out.println(myStack.peek());
        while(!myStack.isEmpty()){
            System.out.print(myStack.pop()+",");
        }
        System.out.println();
        System.out.println("是否为空："+myStack.isEmpty());
        System.out.println("是否满了："+myStack.isFull());
    }
}
