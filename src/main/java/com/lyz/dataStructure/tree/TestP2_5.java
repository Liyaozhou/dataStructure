package com.lyz.dataStructure.tree;/**
 * @Author:759057893@qq.com Lyz
 * @Date: ${Date} 10:40
 * @Description:
 **/

import java.util.Scanner;

/**
 *@Author:759057893@qq.com Lyz
 *@Date: 2019/4/1 10:40
 *@Description:
 **/
public class TestP2_5 {
    public static void main(String[] args) {
        CBTType root = null; //root 为指向二叉树根结点的引用
        int menusel;
        P2_5 t = new P2_5();
        Scanner input = new Scanner(System.in);
        //设置根元素
        root = t.InitTree();
        //添加结点
        do{
            System.out.println("请选择菜单添加二叉树的结点\n");
            System.out.print("0.退出\t");
            System.out.println("1.添加二叉树的结点\n");
            menusel=input.nextInt();
            switch (menusel) {
                case 1:
                    t.addTreeNode(root);
                    break;
                case 0:
                    break;
                default:
                    ;
            }
        }while (menusel!=0);
        //遍历
        do{
            System.out.printf("请选择菜单遍历二叉树，输入0表示退出：\n");
            System.out.printf("1.先序遍历DLR\t");
            System.out.printf("2.中序遍历LDR\t");
            System.out.printf("3.后序遍历LRD\t");
            System.out.println("4.按层遍历\n");
            menusel=input.nextInt();
            switch (menusel){
                case 0:
                    break;
                case 1:
                    System.out.printf("\n先序遍历DLR的结果：");
                    t.DLRTree(root);
                    System.out.println();
                    break;
                case 2:
                    System.out.printf("\n中序遍历LDR的结果：");
                    t.LDRTree(root);
                    System.out.println();
                    break;
                case 3:
                    System.out.printf("\n后序遍历LRD的结果：");
                    t.LRDTree(root);
                    System.out.println();
                    break;
                case 4:
                    System.out.printf("\n按层遍历LRD的结果：");
                    t.LevelTree(root);
                    System.out.println();
                    break;
                default:
                    ;
            }
        }while(menusel!=0);
        //深度
        System.out.println("二叉树深度为："+t.TreeDepth(root));
        t.ClearTree(root);
        root=null;
    }
}
