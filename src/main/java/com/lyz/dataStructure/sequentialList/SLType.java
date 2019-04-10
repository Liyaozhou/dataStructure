package com.lyz.dataStructure.sequentialList;/**
 * @Author:759057893@qq.com Lyz
 * @Date: ${Date} 10:08
 * @Description:
 **/

/**
 *@Author:759057893@qq.com Lyz
 *@Date: 2019/4/1 10:08
 *@Description:
 **/
class SLType {     //定义顺序表结构
    static final int MAXLEN = 100;  //定义顺序表的最大长度
    Data[] ListData = new Data[MAXLEN + 1];  //保存顺序表的结构数组
    int LisLen;         //顺序表已存结点的数量

    //初始化顺序表
    void SLInit(SLType SL) {
        SL.LisLen = 0;
    }

    //计算顺序表的长度
    int SLLength(SLType SL) {
        return (SL.LisLen);
    }

    // 插入结点
    int SLInsert(SLType SL, int n, Data data) {
        int i;
        if (SL.LisLen >= MAXLEN) {
            System.out.println("顺序表已满，不能在插入结点!\n");
            return 0;
        }
        if (n < 1 || n > SL.LisLen - 1) {
            System.out.println("插入元素序号错误，不能插入元素！ \n");
            return 0;
        }
        for (i = SL.LisLen; i >= n; i--) {      //将顺序表中的数据向后移动
            SL.ListData[i + 1] = SL.ListData[i];
        }
        SL.ListData[n] = data;
        SL.LisLen++;
        return 1;
    }

    //追加结点
    int SLAdd(SLType SL, Data data) {  //增加元素到顺序表尾部
        if (SL.LisLen >= MAXLEN) {
            System.out.println("顺序表已满，不能在添加结点了! \n");
            return 0;
        }
        SL.ListData[++SL.LisLen] = data;
        return 1;
    }

    //显示顺序表中的所有节点
    int SLALL(SLType SL) {
        int i;
        for (i = 1; i <= SL.LisLen; i++) {
            System.out.printf("(%s,%s,%d)\n", SL.ListData[i].key, SL.ListData[i].name, SL.ListData[i].age);
        }
        return 0;
    }
}