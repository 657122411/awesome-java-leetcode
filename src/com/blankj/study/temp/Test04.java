package com.blankj.study.temp;

import com.blankj.study.base.BinaryTreeNode;

import java.util.LinkedList;


/**
 * 二叉树层序遍历
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

        bfs(tree);


    }

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
}
