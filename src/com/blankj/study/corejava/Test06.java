package com.blankj.study.corejava;

import java.util.StringJoiner;

public class Test06 {
    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(t.toString());
    }
}

class Test {
    private Integer a;
    private int b;

    @Override
    public String toString() {
        return new StringJoiner(", ", Test.class.getSimpleName() + "[", "]")
                .add("a=" + a)
                .add("b=" + b)
                .toString();
    }
}
