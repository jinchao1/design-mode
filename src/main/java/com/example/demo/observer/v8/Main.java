package com.example.demo.observer.v8;


import java.util.ArrayList;
import java.util.List;

/**
 *  有很多时候，观察者需要根据事件的具体情况来进行处理
 *  大多数时候，我们处理事件的时候，需要事件源对象
 *  事件也可以形成继承体系
 */

class Child{
    private boolean cry = false;
    private List<Observer> observers = new ArrayList<>();
    {
        observers.add(new Dad());
        observers.add(new Mom());
        observers.add(new Dog());
        observers.add((e)->{
            System.out.println("ppp");
        });
        //hook callback function   (钩子函数)
    }


    public boolean isCry() {
        return cry;
    }


    public void wakeUp(){
        System.out.println("WakeUp! Crying wuwuwuuwu...");
        cry = true;

        wakeUpEvent event = new wakeUpEvent(System.currentTimeMillis(),"bed",this);

        for (Observer observer : observers) {
            observer.actionOnWakeUp(event);
        }
    }
}

abstract class Event<T>{
    abstract T getSource();
}

//事件类 fire Event
class wakeUpEvent extends Event<Child>{
    long timestamp;
    String loc;
    Child source;

    public wakeUpEvent(long timestamp, String loc, Child source) {
        this.timestamp = timestamp;
        this.loc = loc;
        this.source = source;
    }

    @Override
    Child getSource() {
        return source;
    }
}

interface Observer{
    void actionOnWakeUp(wakeUpEvent event);
}

class Dad implements Observer {
    public void feed(){
        System.out.println("dad feeding...");
    }

    @Override
    public void actionOnWakeUp(wakeUpEvent event) {
        System.out.println("dad feeding...");
    }
}

class Mom implements Observer {
    public void hug(){
        System.out.println("mom hugging...");
    }

    @Override
    public void actionOnWakeUp(wakeUpEvent event) {
        //............
        //可以根据if条件对event不同的时间和地点做出相应的操作
        System.out.println("mom hugging...");
    }
}

class Dog implements Observer {
    public void wang(){
        System.out.println("dog wang..wang..");
    }

    @Override
    public void actionOnWakeUp(wakeUpEvent event) {
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
