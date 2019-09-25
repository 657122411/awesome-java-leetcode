package com.blankj.study.temp;

import java.util.Scanner;

public class Test12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int[] a = new int[num + 1];
        a[0] = 0;
        for (int i = 1; i <= num; i++) {
            a[i] = a[i - 1] + i;
        }

        for (int i = 0; i <= num - 2; i++) {
            for (int j = i + 1; j <= num; j++) {
                if ((a[j] - a[i] == num)) {
                    sout(i + 1, j);
                } else if ((a[j] - a[i]) > num) {
                    break;
                }
            }
        }

    }

    private static void sout(int m, int n) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = m; i <= n; i++) {
            sb.append(i);
            if (i != n) {
                sb.append(", ");
            }
        }
        sb.append("]");
        System.out.println(sb.toString());
    }

}
