package com.blankj.study.temp;

import java.util.Arrays;

public class Test06 {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 5, 6, 8, 45, 2, 34, 5};
        System.out.println(Arrays.toString(arr));
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arrs, int left, int right) {
        if (left > right) {
            return;
        }

        int i, j, temp, t;
        i = left;
        j = right;
        temp = arrs[i];

        while (i < j) {
            while (temp <= arrs[j] && i < j) {
                j--;
            }
            while (temp >= arrs[i] && i < j) {
                i++;
            }

            if (i < j) {
                t = arrs[i];
                arrs[i] = arrs[j];
                arrs[j] = t;
            }
        }

        arrs[left] = arrs[i];
        arrs[i] = temp;

        quickSort(arrs, left, j - 1);
        quickSort(arrs, j + 1, right);
    }
}
