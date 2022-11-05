package com.example.demo.observer.v3;

/**
 * @Auther: jinchao
 * @Date: 2022/11/5 - 9:08
 * @Description:  加入观察者—Dad
 * @version: 1.0
 */

class Child{
    private boolean cry = false;

    private Dad dad = new Dad();

    public boolean isCry() {
        return cry;
    }


    public void wakeUp(){
        System.out.println("WakeUp! Crying wuwuwuuwu...");
        cry = true;
        dad.feed();
    }
}

class Dad{
    public void feed(){
        System.out.println("dad feeding...");
    }
}

public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        //do sth
        child.wakeUp();
    }


}
