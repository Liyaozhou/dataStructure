package com.lyz.dataStructure.array;

/**
 *@Author:759057893@qq.com Lyz
 *@Date: 2019/3/28 15:16
 *@Description:
 **/
public class TestArrayDemo {

    public static void main(String[] args) {

        ArrayDemo arrayDemo = new ArrayDemo();
        //打印数据
     /*   arrayDemo.print();
        // 添加数据
        arrayDemo.insert(10);
        arrayDemo.insert(15);
        arrayDemo.insert(18);
        arrayDemo.insert(20);
        arrayDemo.insert(30);
        //打印添加的数据
        arrayDemo.print();
        //查询值
        System.out.println(arrayDemo.search(20));
        //根据下标查找数据
        System.out.println(arrayDemo.get(3));
        // 删除数据
        arrayDemo.delete(4);
        //删除后，查询数据
        arrayDemo.print();
        //更新数据
        arrayDemo.update(1,58);
        arrayDemo.print();*/

        arrayDemo.insert1(10);
        arrayDemo.insert1(52);
        arrayDemo.insert1(28);
        arrayDemo.insert1(36);
        arrayDemo.insert1(19);
        arrayDemo.insert1(8);
        arrayDemo.print();
        System.out.println(arrayDemo.ErFenSearch(36));
    }
}
