package com.blankj.study.corejava;
//静态导入
import javafx.beans.binding.ObjectExpression;

import static java.lang.Math.sqrt;

public class Test01 {
    public static void main(String[] args) {
        System.out.println(sqrt(4));
        //数值类型转换
        Object o1 = (1D+1);
        Object o2 = (2F+2);
        Object o3 = (3L+3);
        Object o4 = ('A'+'A');
        System.out.println("顺序dfli");

        String ans = String.join("long","我","是","龙");
        System.out.println(ans);
    }
}
