package com.blankj.study.temp;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Test07 {
    private static String s;
    private static String d[];
    private static List<int[]> resultList;

    public static void fun(int i, int[] check, String current) {
        if (current.length() == 0) {
            int checkd[] = new int[check.length];
            for (int j = 0; j < check.length; j++) {
                checkd[j] = check[j];
            }
            resultList.add(checkd);
            return;
        }
        if (i >= d.length) {
            return;
        }
        //判断是否需要进入左子树
        int sumLength = 0;
        //求出剩余子集中字符串的长度
        for (int j = i + 1; j < d.length; j++) {
            sumLength += d[j].length();
        }
        if (current.length() <= sumLength) {
            //可以进入左子树
            int cTemp = check[i];
            check[i] = 0;
            fun(i + 1, check, current);
            //回溯
            check[i] = cTemp;
        }

        //判断是否可以进入右子树
        if (current.indexOf(d[i]) != -1) {
            String cuTemp = current;
            current = current.substring(0, current.indexOf(d[i])) + current.substring(current.indexOf(d[i]) + d[i].length());
            int cTemp = check[i];
            check[i] = 1;
            fun(i + 1, check, current);
            //回溯
            check[i] = cTemp;
            current = cuTemp;
        }
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        s = scan.nextLine();
        s = s.substring(s.indexOf("\"") + 1, s.lastIndexOf("\""));
        String dict = scan.nextLine();
        dict = dict.substring(dict.indexOf("=") + 1);
        d = dict.split(",");
        for (int i = 0; i < d.length; i++) {
            d[i] = d[i].substring(d[i].indexOf("\"") + 1, d[i].lastIndexOf("\""));
        }
        int[] check = new int[d.length];
        for (int i = 0; i < check.length; i++) {
            check[i] = -1;
        }
        String current = s;
        resultList = new ArrayList<int[]>();
        fun(0, check, current);

        System.out.print("[");
        //将对结果集中的结果进行处理
        Iterator iter = resultList.iterator();
        int size = resultList.size();
        int count = 0;
        while (iter.hasNext()) {

            String sTemp = new String(s);
            int[] p = (int[]) iter.next();
            for (int i = 0; i < p.length; i++) {
                if (p[i] == 1) {
                    int index = sTemp.indexOf(d[i]) + d[i].length();
                    if (index != sTemp.length()) {
                        String sTemp1 = sTemp.substring(0, index);
                        String sTemp2 = sTemp.substring(index);
                        sTemp = sTemp1 + " " + sTemp2;
                    }
                }
            }
            System.out.print(sTemp);
            if (count < size - 1) {
                System.out.print(", ");
                count++;
            }
        }
        System.out.print("]");
    }
}


