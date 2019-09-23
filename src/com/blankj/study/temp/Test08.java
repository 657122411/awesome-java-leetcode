package com.blankj.study.temp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Test08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<int[]> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int k = scanner.nextInt();
            int in[] = new int[k];
            for (int j = 0; j < k; j++) {
                in[j] = scanner.nextInt();
            }
            list.add(in);
        }
        for (int[] ints : list) {
            resolve(ints);
        }
    }

    public static void resolve(int[] m) {
        int[] dp = new int[m.length];
        dp[0] = 1;
        for (int i = 1; i <= m.length - 1; i++) {
            int x = sum(m, i);
            int temp = dp[i - 1] + 1;
            dp[i] = (m[i] >= x ? temp : 1);
        }
        Arrays.sort(dp);

        System.out.println(dp[m.length - 1]);

    }

    public static int sum(int[] k, int index) {
        int temp = 0;
        for (int i = index - 1; i >= 0; i--) {
            if (i - 1 > 0) {
                if (k[i - 1] >= k[1])
                    break;
            }
            temp += k[i];
        }
        return temp;
    }
}
