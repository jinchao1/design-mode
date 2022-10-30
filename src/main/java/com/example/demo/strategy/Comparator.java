package com.example.demo.strategy;

/**
 * @Auther: jinchao
 * @Date: 2022/10/30 - 9:31
 * @Description: com.example.demo.strategy
 * @version: 1.0
 */
@FunctionalInterface
public interface Comparator<T> {
    int compare(T o1,T o2);

    default void m(){
        System.out.println("1.8之前这里写不了方法，1.8之后可以");
    }
}
