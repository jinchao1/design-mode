package com.example.demo.strategy;

/**
 * @Auther: jinchao
 * @Date: 2022/10/25 - 22:17
 * @Description: com.example.demo.strategy
 * @version: 1.0
 */
public class Sorter {

    public static void sort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;

            for (int j = i+1; j < arr.length; j++) {
                minPos = arr[j] < arr[minPos] ? j : minPos;
            }
            swap(arr, i, minPos);
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}





























