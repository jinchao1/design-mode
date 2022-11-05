package com.example.demo.observer.v2;

/**
 * @Auther: jinchao
 * @Date: 2022/11/5 - 9:08
 * @Description:  面向对象的傻等
 * @version: 1.0
 */

class Child{
    private boolean cry = false;

    public boolean isCry() {
        return cry;
    }

    public void wakeUp(){
        System.out.println("WakeUp! Crying wuwuwuuwu...");
        cry = true;
    }
}
public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        while (!child.isCry()){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("observing...");
        }
    }


}
