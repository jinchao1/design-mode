package com.example.demo.singleton;

/**
 *  lazy loading
 *  也称懒汉式
 *  虽然达到了按需初始化的目的，但却带来了线程不安全的问题
 *
 *  加锁保证线程安全，但是效率降低
 */
public class Demo4 {

    private static Demo4 INSTANCE;

    private Demo4(){};

    public static Demo4 getINSTANCE(){
        if(INSTANCE == null){
            //试图通过减小同步代码块的方式提高效率，但是不可行
            synchronized (Demo4.class){
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                INSTANCE = new Demo4();
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(Demo4.getINSTANCE().hashCode());
            }).start();
        }
    }
}
