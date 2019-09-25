package com.blankj.study.temp;


class B {
    B() {
        System.out.println("B()构造");
    }
}

class A {
    B b = new B();

    public A() {
        System.out.println("A的构造方法");
    }

    public static int j = print();

    public static int print() {
        System.out.println("A static方法块");
        return 521;
    }

    {
        System.out.println("A {}构造代码块");
    }
}


public class Test11 extends A {
    public Test11() {
        System.out.println("Test1的构造方法");
    }

    public static int k = print();

    public static int print() {
        System.out.println("Test print");
        return 522;
    }

    {
        System.out.println("子类{}方法块");
    }

    public static void main(String[] args) {
        System.out.println("main start");
        Test11 t1 = new Test11();
        A.print();
    }
}
