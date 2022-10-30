package com.example.demo.strategy;

/**
 * @Auther: jinchao
 * @Date: 2022/10/25 - 23:12
 * @Description: com.example.demo.strategy
 * @version: 1.0
 */
public class Cat implements Comparable<Cat>{
    int weight, height;

    public Cat(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }

    public int compareTo(Cat c){
//        Cat c = (Cat) o;
        if(this.weight < c.weight){
            return -1;
        }else if(this.weight > c.weight){
            return 1;
        }else {
            return 0;
        }
    }
}




















