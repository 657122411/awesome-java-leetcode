package com.blankj.study.corejava;

import java.util.ArrayList;
import java.util.Arrays;

public class Test02 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.ensureCapacity(1);
        System.out.println(list.size());
        list.add(1);
        list.add(2);
        list.add(3);
        Integer[] arr = new Integer[list.size()];
        list.toArray(arr);
        System.out.println(Arrays.toString(arr));

        Integer i = list.remove(1);
        System.out.println(i);
    }
}
