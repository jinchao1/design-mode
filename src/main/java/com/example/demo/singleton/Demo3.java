package com.example.demo.singleton;

/**
 *  lazy loading
 *  也称懒汉式
 *  虽然达到了按需初始化的目的，但却带来了线程不安全的问题
 *
 *  加锁保证线程安全，但是效率降低
 */
public class Demo3 {

    private static Demo3 INSTANCE;

    private Demo3(){};

    public static synchronized Demo3 getINSTANCE(){
        if(INSTANCE == null){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new Demo3();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(Demo3.getINSTANCE().hashCode());
            }).start();
        }
    }
}
