package com.example.demo.singleton;

/**
 *  lazy loading
 *  也称懒汉式
 *  虽然达到了按需初始化的目的，但却带来了线程不安全的问题
 */
public class Demo2 {

    private static Demo2 INSTANCE;

    private Demo2(){};

    public static Demo2 getINSTANCE(){
        if(INSTANCE == null){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new Demo2();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(Demo2.getINSTANCE().hashCode());
            }).start();
        }
    }
}
