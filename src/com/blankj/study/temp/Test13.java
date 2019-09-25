package com.blankj.study.temp;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Test13 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List list = Arrays.asList(arr);
        //System.out.println(list);
        //正确方式
        List arrlist = Arrays.stream(arr).boxed().collect(Collectors.toList());
        System.out.println(arrlist);


        String[] a = {"我", "是", "龙"};
        List list1 = Arrays.asList(a);
        System.out.println(list1);
        a[1] = "不是";
        list1.set(2, "虫");
        System.out.println(Arrays.toString(a));
        System.out.println(list1.toString());

        //list1.add("新增");
        //list1.remove("我");
        System.out.println(list1);


    }
}
