package com.blankj.study.temp;

public class Test03 {

    public static void main(String args[]) {
        StringBuilder sb1 = new StringBuilder("aaa");
        StringBuilder sb2 = new StringBuilder("bbb");

        swap(sb1, sb2);

        System.out.println(sb1.toString() + ',' + sb2.toString());

    }

    public static void swap(StringBuilder x, StringBuilder y) {
        x.append(y);
        y = x;
    }


}
