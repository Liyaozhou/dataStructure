package com.lyz.dataStructure.sequentialList;/**
 * @Author:759057893@qq.com Lyz
 * @Date: ${Date} 13:15
 * @Description:
 **/

import java.util.Scanner;

/**
 *@Author:759057893@qq.com Lyz
 *@Date: 2019/3/30 13:15
 *@Description:
 **/
public class TestData {

    public static void main(String[] args) {
        SLType SL = new SLType();  //定义顺序表变量
        Data pdata;     //定义结点保存引用变量
        String key;     //保存关键字
        System.out.println("顺序表操作演示！ \n");
        // 初始化顺序表
        SL.SLInit(SL);
        System.out.println("初始化顺序表完成！\n");

        Scanner input = new Scanner(System.in);

        do{
            System.out.println("输入添加的结点(学号 姓名 年龄)");
            Data data = new Data();
            data.name = input.next();
            data.key = input.next();
            data.age = input.nextInt();
            if(data.age!=0){        //若年龄不为0
                if(SL.SLAdd(SL,data)==0){   //若添加结点失败
                    break;      //退出死循环
                }
            }else {
                break;
            }
        }while(true);
            System.out.println("\n 顺序表中的结点顺序为：\n");
            SL.SLALL(SL);
    }
}
