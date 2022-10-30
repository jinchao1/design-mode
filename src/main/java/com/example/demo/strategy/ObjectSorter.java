package com.example.demo.strategy;

/**
 * @Auther: jinchao
 * @Date: 2022/10/25 - 22:17
 * @Description: com.example.demo.strategy
 * @version: 1.0
 */
public class ObjectSorter<T> {

    public void sort(T[] arr,Comparator<T> comparator){
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;

            for (int j = i+1; j < arr.length; j++) {
                minPos = comparator.compare(arr[j],arr[minPos])==-1 ? j : minPos;
            }
            swap(arr, i, minPos);
        }
    }

    void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}





























