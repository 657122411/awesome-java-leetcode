package com.blankj.study.temp;

import com.blankj.study.base.Node;

/**
 * 翻转链表
 */
public class Test05 {

    public static void main(String[] args){
        Node head = new Node("head");
        Node node1 = new Node("1");
        Node node2 = new Node("2");
        Node node3 = new Node("3");
        Node node4 = new Node("4");
        Node node5 = new Node("5");

        head.setNext(node1);
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node5);
        node5.setNext(null);

        say(head);
        System.out.println("reverse");

        Node reverse = reverseList(head);
        say(reverse);


    }

    public static void say(Node node){
        if(node==null){
            return;
        }

        while(node.getNext()!=null){
            System.out.println(node.getData());
            node = node.getNext();
        }
    }

    public static Node reverseList(Node head){
        Node pre = null;
        Node next = null;

        while(head!=null){
            next = head.getNext();
            head.setNext(pre);
            pre = head;
            head = next;
        }

        return pre;
    }

}
