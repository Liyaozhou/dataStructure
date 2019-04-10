package com.lyz.dataStructure.array;

/**
 *@Author:759057893@qq.com Lyz
 *@Date: 2019/3/28 15:01
 *@Description:
 **/
/*
数据结构 第一节  数组
 */
public class ArrayDemo {

    private int[] arr;

    //表示有效数据的长度
    private int elements;

    public ArrayDemo(){
        arr = new int[50];
    }

    /*

     */
    public ArrayDemo(int maxsize){
         arr = new int[maxsize];
    }

    /*
    添加数据
     */
    public void insert(int value){
        arr[elements]=value;
        elements++;
    }

    /*
    添加数组排序
     */
    public void insert1(int value){
        int i ;

        for(i =0;i<elements;i++) {
            if (arr[i] > value) {
                break;
            }
        }
        for(int j=elements;j>i;j--){
                arr[j] = arr[j-1];
        }
            arr[i] =value;
            elements++;
        }

        /*
        使用二分法查找有序数组的下标
         */
        public int ErFenSearch(int value){
            int lower = 0;
            int middle ;
            int power = elements;
            while(true){
                middle = (lower+power)/2;
                if(arr[middle]==value){
                    return  middle;
                }else if(lower>value){
                    return -1;
                }else{
                    if(arr[middle]>value){
                        power = middle -1;
                    }else{
                        lower = middle + 1;
                    }
                }
            }
        }


    /*
    打印
     */
    public void  print(){
        System.out.print("[");
        for(int i=0;i<elements;i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println("]");
    }
    /*
    查询值
     */
    public int  search(int value){
        int i;
        for(i=0;i<elements;i++){
            if(value==arr[i]){
                break;
            }
        }
        if(i == elements){
            return -1;
        }else {
            return 1;
        }
    }
    /*
    查询下标
     */
    public int get(int index){
        if(index>=elements || index< 0){
            throw  new ArrayIndexOutOfBoundsException();
        }else{
           return  arr[index];
        }
    }

    /*
    删除下标
     */
    public void delete(int index){
        if(index>=elements || index< 0){
            throw  new ArrayIndexOutOfBoundsException();
        }else{
           for(int i =index;i<elements;i++){
               arr[index] = arr[index+1];
           }
           elements--;
        }
    }

    /*
    更新数据
     */
    public void  update(int index,int newValue){
        if(index>=elements || index< 0){
            throw  new ArrayIndexOutOfBoundsException();
        }else{
            arr[index] = newValue;
        }
    }


}
