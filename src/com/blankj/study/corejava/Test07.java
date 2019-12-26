package com.blankj.study.corejava;

public class Test07 {
    private static Object o = new Object();

    public static void main(String[] args){
        synchronized(o){
            System.out.println("锁的是对象不是代码!");
        }
    }

    public synchronized void m(){
        //synchronized(this)
    }

    public static synchronized void n(){
        //synchronized(Test07.class)
    }
}
