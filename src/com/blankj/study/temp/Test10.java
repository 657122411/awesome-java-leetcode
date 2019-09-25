package com.blankj.study.temp;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test10 {

    public static void main(String argv[]) {
        String[] s_arr = /*new String[]*/{"i", "am", "long"};
        List<String> list = Arrays.asList(s_arr);
        System.out.println(list.toString());

        int[] i_arr = new int[]{1, 8, 6, 1, 7};
        //Arrays.sort(i_arr);
        List<Integer> list1 = Arrays.stream(i_arr).boxed().collect(Collectors.toList());
        list1.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println(list1.toString());
    }
}

