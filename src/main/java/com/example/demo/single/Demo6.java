package com.example.demo.single;

/**
 *  静态内部类方式
 *  JVM保证单例
 *  加载外部类时不会加载内部类，这样可以实现懒加载
 */
public class Demo6 {

    private Demo6(){};

    private static class Demo6Holder{
        private static final Demo6 INSTANCE = new Demo6();
    }

    public static Demo6 getInstance(){
        return Demo6Holder.INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(Demo6.getInstance().hashCode());
            }).start();
        }
    }
}
