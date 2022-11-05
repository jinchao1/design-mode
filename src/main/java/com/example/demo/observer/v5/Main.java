package com.example.demo.observer.v5;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: jinchao
 * @Date: 2022/11/5 - 9:08
 * @Description:  分离观察者与被观察者
 * @version: 1.0
 */

class Child{
    private boolean cry = false;
    private List<Observer> observers = new ArrayList<>();
    {
        observers.add(new Dad());
        observers.add(new Mom());
        observers.add(new Dog());
    }


    public boolean isCry() {
        return cry;
    }


    public void wakeUp(){
        System.out.println("WakeUp! Crying wuwuwuuwu...");
        cry = true;
        for (Observer observer : observers) {
            observer.actionOnWakeUp();
        }
    }
}

interface Observer{
    void actionOnWakeUp();
}

class Dad implements Observer{
    public void feed(){
        System.out.println("dad feeding...");
    }

    @Override
    public void actionOnWakeUp() {
        System.out.println("dad feeding...");
    }
}

class Mom implements Observer{
    public void hug(){
        System.out.println("mom hugging...");
    }

    @Override
    public void actionOnWakeUp() {
        System.out.println("mom hugging...");
    }
}

class Dog implements Observer{
    public void wang(){
        System.out.println("dog wang..wang..");
    }

    @Override
    public void actionOnWakeUp() {
        System.out.println("dog wang..wang..");
    }
}

public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        //do sth
        child.wakeUp();
    }


}
