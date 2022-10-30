package com.example.demo.strategy;

/**
 * @Auther: jinchao
 * @Date: 2022/10/30 - 9:31
 * @Description: com.example.demo.strategy
 * @version: 1.0
 */
public interface Comparator<T> {
    int compare(T o1,T o2);
}
