package com.example.demo.strategy;

import java.util.Arrays;

/**
 * @Auther: jinchao
 * @Date: 2022/10/25 - 22:16
 * @Description: com.example.demo.strategy
 * @version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        /*int[] arr = {5,8,2,7,3,1};
        Sorter.sort(arr);
        System.out.println(Arrays.toString(arr));*/

        /*Cat[] a = {new Cat(3,3),new Cat(5,5),new Cat(1,1)};
        CatSorter.sort(a);
        System.out.println(Arrays.toString(a));*/

        Dog[] d = {new Dog(7),new Dog(2),new Dog(5)};
        ObjectSorter<Dog> DogSorter = new ObjectSorter<>();
        DogSorter.sort(d,new DogComparator());
        System.out.println("狗狗"+Arrays.toString(d));

        Cat[] c = {new Cat(3,3),new Cat(5,5),new Cat(1,1)};
        ObjectSorter<Cat> CatSorter = new ObjectSorter<>();
        CatSorter.sort(c,new CatHeightComparator());
        System.out.println("猫猫"+Arrays.toString(c));
    }
}
