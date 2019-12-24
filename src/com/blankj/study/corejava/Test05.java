package com.blankj.study.corejava;

import com.blankj.study.base.Node;

public class Test05 {
    public static final int initData = 666;

    //常量 静态变量 类信息置于方法区 (Test05.class 与node指针)
    public static Node node = new Node();

    //每一个方法对应一个栈帧内存区域(cpmpute()栈帧)
    public int compute(){
        //局部变量表存放在栈
        int a = 1;
        int b = 2;
        //操作数栈
        int c = (a+b)*10;
        return c;
    }

    public static void main(String[] args) {
        //对象置于堆，在main()栈帧中存放局部变量表 test指向它
        Test05 test = new Test05();
        test.compute();
    }
}
