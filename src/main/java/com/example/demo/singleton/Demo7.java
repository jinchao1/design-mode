package com.example.demo.singleton;

/**
 *   todo: 枚举单例
 *  不仅可以解决线程同步，还可以防止反序列化
 */
public enum Demo7 {

    INSTANCE;

    public void m(){}

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(Demo7.INSTANCE.hashCode());
            }).start();
        }
    }

}
