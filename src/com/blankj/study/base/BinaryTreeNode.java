package com.blankj.study.base;

public class BinaryTreeNode {
    private int data;
    private BinaryTreeNode LchildNode;
    private BinaryTreeNode RchildNode;

    public BinaryTreeNode(int data) {
        super();
        this.data = data;
    }

    public int getData() {
        return this.data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public BinaryTreeNode getLchild() {
        return LchildNode;
    }

    public void setLchild(BinaryTreeNode lchildNode) {
        this.LchildNode = lchildNode;
    }

    public BinaryTreeNode getRchild() {
        return RchildNode;
    }

    public void setRchild(BinaryTreeNode rchildNode) {
        this.RchildNode = rchildNode;
    }


}
