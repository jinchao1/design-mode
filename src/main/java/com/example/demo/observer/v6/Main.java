package com.example.demo.observer.v6;


import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: jinchao
 * @Date: 2022/11/5 - 9:08
 * @Description:  分离出专门的事件类
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

        wakeUpEvent event = new wakeUpEvent(System.currentTimeMillis(),"bed");

        for (Observer observer : observers) {
            observer.actionOnWakeUp(event);
        }
    }
}

//事件类 fire Event
class wakeUpEvent{
    long timestamp;
    String loc;

    public wakeUpEvent(long timestamp, String loc) {
        this.timestamp = timestamp;
        this.loc = loc;
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
