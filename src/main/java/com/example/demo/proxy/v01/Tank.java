package com.example.demo.proxy.v01;

import java.util.Random;

/**
 *  问题：我想记录坦克的移动时间
 */
public class Tank implements Movabel{

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
}

interface Movabel{
    void move();
}

