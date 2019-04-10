package com.lyz.dataStructure.graph;

/**
 *@Author:759057893@qq.com Lyz
 *@Date: 2019/4/1 22:14
 *@Description:
 **/

public class TestGraph {
    public static void main(String[] args) {
        Graph g = new Graph();
        g.addVertex('A');
        g.addVertex('B');
        g.addVertex('C');
        g.addVertex('D');

        g.addEdge(0,1);
        g.addEdge(1,2);
        g.addEdge(2,3);

        g.dfs();

    }
}
