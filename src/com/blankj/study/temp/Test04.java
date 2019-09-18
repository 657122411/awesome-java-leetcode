package com.blankj.study.temp;

import com.blankj.study.base.BinaryTreeNode;

import java.util.LinkedList;
import java.util.Stack;


/**
 * 二叉树遍历
 */
public class Test04 {
    public static void main(String[] args) {
        BinaryTreeNode tree1 = new BinaryTreeNode(1);
        BinaryTreeNode tree2 = new BinaryTreeNode(2);
        BinaryTreeNode tree3 = new BinaryTreeNode(3);
        BinaryTreeNode tree4 = new BinaryTreeNode(4);
        BinaryTreeNode tree5 = new BinaryTreeNode(5);
        BinaryTreeNode tree = new BinaryTreeNode(0);
        tree.setLchild(tree1);
        tree.setRchild(tree2);
        tree1.setLchild(tree3);
        tree1.setRchild(tree4);
        tree2.setLchild(tree5);

        System.out.println("BFS");
        bfs(tree);

        System.out.println("DFS");
        dfs(tree);

    }

    // 广度优先（层序）遍历
    public static void bfs(BinaryTreeNode node) {
        if (node == null) {
            return;
        }
        LinkedList<BinaryTreeNode> queue = new LinkedList();
        queue.offer(node);

        while (!queue.isEmpty()) {
            BinaryTreeNode tmp = queue.poll();
            System.out.println(tmp.getData());

            if (tmp.getLchild() != null) {
                queue.offer(tmp.getLchild());
            }

            if (tmp.getRchild() != null) {
                queue.offer(tmp.getRchild());
            }
        }
    }

    public static void dfs(BinaryTreeNode node){
        if (node == null) {
            return;
        }
        Stack<BinaryTreeNode> stack = new Stack();
        stack.push(node);

        while (!stack.isEmpty()) {
            BinaryTreeNode tmp = stack.pop();
            System.out.println(tmp.getData());

            if (tmp.getRchild() != null) {
                stack.push(tmp.getRchild());
            }

            if (tmp.getLchild() != null) {
                stack.push(tmp.getLchild());
            }


        }
    }
}
