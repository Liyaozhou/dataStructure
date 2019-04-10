package com.lyz.dataStructure.tree;/**
 * @Author:759057893@qq.com Lyz
 * @Date: ${Date} 10:12
 * @Description:
 **/

import sun.reflect.generics.tree.Tree;

import java.util.Scanner;

/**
 *@Author:759057893@qq.com Lyz
 *@Date: 2019/4/1 10:12
 *@Description:
 **/

/*
    String data;  //元素数据
    CBTType left; //左子树结点引用
    CBTType right; //右子树结点引用
 */
public class P2_5 {

    static final  int MAXLEN= 20;         //定义最大长度
    static Scanner  input = new Scanner(System.in);

    //初始化二叉树的根
    CBTType InitTree(){
        CBTType node;
        if((node  = new CBTType())!=null){   //申请内存
            System.out.println("请先输入一个根结点数据：\n");
            node.data = input.next();
            node.left = null;
            node.right = null;
            if(node!=null){       //如果二叉树根结点不为空
                return node;
            }else{
                return null;
            }
        }
        return null;
    }
    //添加结点
/*
添加结点即为在二叉树中添加结点数据，添加结点时除了要输入结点数据外，
还需要指定其父节点，以及添加的结点是作为左节点还是作为右节点
 */
    void  addTreeNode( CBTType treeNode){
        CBTType pnode,parent;
        String data;
        int menusel;
        if((pnode=new CBTType())!=null){
            System.out.println("请输入二叉树的结点数据：\n");
            pnode.data = input.next();
            pnode.left = null;
            pnode.right = null; //设置左右子树为空
            System.out.println("输入该结点的父结点数据：");
            data=input.next();

            parent = TreeFindNode(treeNode,data);
            if(parent==null){
                System.out.println("未找到该父结点！\n");
                pnode=null;
                return;
            }
            System.out.printf("1.添加该结点到左子树\n 2.添加该结点到右子树\n");
            do{
                menusel =input.nextInt();
                if(menusel==1||menusel==2){
                    if(parent==null){
                        System.out.println("不存在父结点，请先设置父结点！\n");
                    }else{
                        switch (menusel){
                            case 1:          //添加到左结点
                                 if(parent.left!=null){     //左子树不为空
                                     System.out.println("左子树结点不为空！\n");
                                 }else{
                                     parent.left = pnode;
                                 }
                                 break;
                            case 2:          //添加到右结点
                                if(parent.right!=null){     //右子树不为空
                                    System.out.println("右子树结点不为空！\n");
                                }else{
                                    parent.right = pnode;
                                }
                                break;
                             default:
                                 System.out.println("无效参数！\n");
                        }
                    }
                }
            }while(menusel!=1&&menusel!=2);
        }
    }


    //查找结点  输入参数treeNode为待查找的二叉树的根结点，输入data为待查找的结点数据
    CBTType TreeFindNode(CBTType treeNode,String data){
        CBTType ptr;
        if(treeNode ==null){
            return  null;
        }else{
            if(treeNode.data.equals(data)){
                return treeNode;
            }else{      //分别向左右子树递归查询
                if((ptr=TreeFindNode(treeNode.left,data))!=null){
                    return ptr;
                }else  if((ptr=TreeFindNode(treeNode.right,data))!=null){
                    return ptr;
                }else {
                    return  null;
                }
            }
        }
    }


     //获取左子树
    //获取左子树即返回当前结点的左子树结点的值。由于在二叉树树结构中定义了相应的引用，查询比较简单
    //输入参数 treeNode为二叉树的一个结点，该程序将返回该结点的左子树的引用。
    CBTType TressLeftNode(CBTType treeNode){
        if(treeNode!=null){
            return treeNode.left;
        }else{
            return null;
        }
    }
    //获取右子树
    CBTType TressRightNode(CBTType treeNode){
        if(treeNode!=null){
            return treeNode.right;
        }else{
            return null;
        }
    }

    //判断是否为空树
    int TreeIsEmpty(CBTType treeNode){
        if(treeNode!=null){
            return 0;
        }else {
            return 1;
        }
    }

    //计算二叉树的深度
    // 输入参数treeNode 为待计算的二叉树的根结点，先判断根结点是否为空，然后按照递归调用来计算左右子树的深度
    int TreeDepth(CBTType treeNode){
        int depleft,depright;
        if(treeNode==null){
            return  0; //对于空树，深度为0
        }else{
            depleft = TreeDepth(treeNode.left);  // 递归调用
            depright = TreeDepth(treeNode.right);  // 递归调用
            if(depleft>depright){
                return depleft+1;
            }else {
                return depright+1;
            }
        }
    }

    //清空二叉树
    void ClearTree(CBTType treeNode){
        if(treeNode!=null){
            ClearTree(treeNode.left);  //清空左子树
            ClearTree(treeNode.right); //清空右子树
            treeNode=null;  //释放当前结点所占内存

        }
    }
    //显示结点数据
    void TreeNodeData(CBTType p){
        System.out.printf("%s",p.data);
    }

    //按层遍历算法
    /*
    按层遍历算法是最直观的遍历算法。首先处理第1层即根结点，再处理第1层根结点的
左右子树，即第2层……，循环处理，就可以逐层遍历。按层遍历算法的代码示例如下
     */
    void LevelTree(CBTType treeNode){
        CBTType p;
        CBTType[] q = new CBTType[MAXLEN];  //定义一个顺序栈
        int head=0,tail =0;

        if(treeNode!=null){
            tail=(tail+1)%MAXLEN;  //计算循环队列队尾序号
            q[tail]=treeNode;       //将二叉树根引用进队
        }
        while(head!=tail){          //队列不为空，进行循环
            head=(head+1)%MAXLEN;   //计算循环队列的队首序号
            p=q[head];              //获取队首
            TreeNodeData(p);        //处理队首元素
            if(p.left!=null){       //如果结点存在左子树
                tail = (tail+1)%MAXLEN;     //计算循环队列的队尾序号
                q[tail]=p.left;             //将左子树引用

            }
            if(p.right!=null){       //如果结点存在右子树
                tail = (tail+1)%MAXLEN;     //计算循环队列的队尾序号
                q[tail]=p.right;             //将右子树引用
            }
        }
    }

    //先序遍历
    void  DLRTree(CBTType treeNode){
        if(treeNode!=null){
            TreeNodeData(treeNode);
            DLRTree(treeNode.left);
            DLRTree(treeNode.right);
        }
    }

    //中序遍历
    void  LDRTree(CBTType treeNode){
        if(treeNode!=null){
            LDRTree(treeNode.left);
            TreeNodeData(treeNode);
            LDRTree(treeNode.right);
        }
    }

    //先序遍历
    void  LRDTree(CBTType treeNode){
        if(treeNode!=null){
            LRDTree(treeNode.left);
            LRDTree(treeNode.right);
            TreeNodeData(treeNode);
        }
    }

}
