package com.blankj.easy._006;


import com.blankj.study.base.BinaryTreeNode;

public class No06 {
    private String midOrder;

    public static void main(String[] args) {
        String preOrder = "12473568";
        String midOrder = "47215386";

        BiTree tree = new BiTree(preOrder, midOrder, preOrder.length());
        tree.postRootTraverse(tree.root);
    }
}

class BiTree {
    BinaryTreeNode root;

    public BiTree(String preOrder, String midOrder, int count) {
        if (count <= 0) {
            return;
        }
        char c = preOrder.charAt(0);
        int i = 0;
        for (; i < count; i++) {
            if (midOrder.charAt(i) == c) break;
        }
        root = new BinaryTreeNode(c);
        root.setLchild(new BiTree(preOrder.substring(1, i + 1), midOrder.substring(0, i), i).root);
        root.setRchild(new BiTree(preOrder.substring(i + 1), midOrder.substring(i + 1), count - i - 1).root);
    }

    public void postRootTraverse(BinaryTreeNode root) {
        if (root != null) {
            postRootTraverse(root.getLchild());
            postRootTraverse(root.getRchild());
            System.out.print(root.getData());
        }
    }
}
