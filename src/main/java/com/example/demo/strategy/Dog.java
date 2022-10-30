package com.example.demo.strategy;

/**
 * @Auther: jinchao
 * @Date: 2022/10/30 - 9:16
 * @Description: com.example.demo.strategy
 * @version: 1.0
 */
public class Dog implements Comparable<Dog>{

    int food;

    public Dog(int food) {
        this.food = food;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "food=" + food +
                '}';
    }

    @Override
    public int compareTo(Dog d) {

//        Dog d = (Dog) o;
        if(this.food < d.food){
            return -1;
        }else if(this.food > d.food){
            return 1;
        }else {
            return 0;
        }

    }
}
