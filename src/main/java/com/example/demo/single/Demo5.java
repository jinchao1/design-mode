package com.example.demo.single;

/**
 *  lazy loading
 *  也称懒汉式
 *  虽然达到了按需初始化的目的，但却带来了线程不安全的问题
 *
 *  双重判空
 */
public class Demo5 {

    private static volatile Demo5 INSTANCE; //volatile  防止指令重排序

    private Demo5(){};

    public static Demo5 getINSTANCE(){
        if(INSTANCE == null){
            //试图通过减小同步代码块的方式提高效率，但是不可行
            synchronized (Demo5.class){
                //双重判空
                if(INSTANCE == null){
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    INSTANCE = new Demo5();
                }
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(Demo5.getINSTANCE().hashCode());
            }).start();
        }
    }
}
