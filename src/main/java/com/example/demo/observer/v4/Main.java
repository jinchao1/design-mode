package com.example.demo.observer.v4;

/**
 * @Auther: jinchao
 * @Date: 2022/11/5 - 9:08
 * @Description:  加入多个观察者
 * @version: 1.0
 */

class Child{
    private boolean cry = false;
    private Dad dad = new Dad();
    private Mom mom = new Mom();
    private Dog dog = new Dog();


    public boolean isCry() {
        return cry;
    }


    public void wakeUp(){
        System.out.println("WakeUp! Crying wuwuwuuwu...");
        cry = true;
        dad.feed();
        mom.hug();
        dog.wang();
    }
}

class Dad{
    public void feed(){
        System.out.println("dad feeding...");
    }
}

class Mom{
    public void hug(){
        System.out.println("mom hugging...");
    }
}

class Dog{
    public void wang(){
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
