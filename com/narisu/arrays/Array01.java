package com.narisu.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Array01 {
    public static void main(String[] args) {
        int[] arr = {1,-1,8,0,20,};
        //bubble01(arr);
        bubble02(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                int i1 = (Integer) o1;
                int i2 = (Integer) o2;
                return i1 - i2;
            }
        });

        System.out.println("=======排序后的情况=======");
        System.out.println(Arrays.toString(arr));
    }
    //冒泡排序
    public static void bubble01(int[] arr) {
        int temp = 0;
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = 0; j < arr.length - 1 - i; j++) {
                //从小到达
                if(arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void bubble02(int[] arr, Comparator c) {
        int temp = 0;
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = 0; j < arr.length - 1 - i; j++) {
                //从小到达
                if(c.compare(arr[j], arr[j + 1]) > 0) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

