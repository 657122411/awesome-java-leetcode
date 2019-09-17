package com.blankj.study.temp;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 获取字符串数组公共前缀
 */
public class Test02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] temp = input.split(" ");


        String ans = duplicateFront(temp);

        System.out.println(ans);
    }

    public static String duplicateFront(String[] strs) {
        if (!check(strs)) {
            return "";
        }

        Arrays.sort(strs);

        StringBuilder sb = new StringBuilder();

        int len = strs.length;

        int m = strs[0].length();
        int n = strs[len - 1].length();
        int l = Math.min(m, n);

        for (int i = 0; i < l; i++) {
            if (strs[0].charAt(i) == strs[len - 1].charAt(i)) {
                sb.append(strs[0].charAt(i));
            } else {
                break;
            }
        }


        return sb.toString();


    }

    private static boolean check(String[] strs) {
        boolean flag = false;
        if (strs != null) {
            for (String str : strs) {
                if (str != null && str.length() != 0) {
                    return true;
                } else {
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }

}
