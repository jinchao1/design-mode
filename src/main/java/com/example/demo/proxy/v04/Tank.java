package com.example.demo.proxy.v04;

import java.util.Random;

/**
 *  问题：我想记录坦克的移动时间
 *  最简单的方法：修改代码，记录时间
 *  问题2：如果无法改变方法源码呢？
 *  用继承？
 */
public class Tank implements Movabel {

    /**
     * 模拟坦克移动了一段时间
     */
    @Override
    public void move() {
        System.out.println("Tank moving claclacla...");
        try {
            Thread.sleep(new Random().nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Tank2().move();
    }
}

class Tank2 extends Tank{
    @Override
    public void move() {
        long start = System.currentTimeMillis();
        super.move();
        long end = System.currentTimeMillis();
        System.out.println("坦克移动时间为："+(end - start));
    }
}

interface Movabel{
    void move();
}

