package com.blankj.study.temp;

import java.util.Scanner;

public class Test01 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String[] str1 = new String[n];
        String[] str2 = new String[m];
        for (int i = 0; i < n; i++) {
            str1[i] = sc.next();
        }
        for (int i = 0; i < m; i++) {
            str2[i] = sc.next();
        }
        //str2[0]

        for (int k = 0; k < m; k++) {
            //str2去str1中找
            int[] res = new int[n];
            for (int i = 0; i < n; i++) {
                res[i] = 1;
            }
            int sum = 0;
            for (int i = 0; i < n; i++) {
                if (str1[i].charAt(0) == '*') {
                    int end = str2[k].length() - 1;
                    for (int j = str1[i].length() - 1; j >= 1; j--) {
                        if (str1[i].charAt(j) == str2[k].charAt(end)) {
                            end--;
                            continue;
                        } else {
                            res[i] = 0;
                            break;
                        }
                    }
                } else if (str1[i].charAt(str1[i].length() - 1) == '*') {
                    int start = 0;
                    for (int j = 0; j <= str1[i].length() - 2; j++) {
                        if (str1[i].charAt(j) == str2[k].charAt(start)) {
                            start++;
                            continue;
                        } else {
                            res[i] = 0;
                            break;
                        }
                    }
                } else {
                    for (int j = 0; j < str1[i].length(); j++) {
                        if (str1[i].charAt(j) == str2[k].charAt(j)) {
                            continue;
                        } else {
                            res[i] = 0;
                            break;
                        }
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                sum += res[i];
            }
            if (sum == 0) {
                System.out.print(0 + " ");
            } else {
                System.out.print(1 + " ");
            }

        }

    }
}
