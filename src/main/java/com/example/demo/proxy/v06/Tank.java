package com.example.demo.proxy.v06;

import java.util.Random;

/**
 *  问题：我想记录坦克的移动时间
 *  最简单的方法：修改代码，记录时间
 *  问题2：如果无法改变方法源码呢？
 *  用继承？
 *  v05:使用代理
 *  v06:代理有各种类型
 *  问题：如何实现代理的各种组合？继承？Decorator?
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
        new TankTimeProxy(new Tank()).move();
    }
}

class TankTimeProxy implements Movabel {

    Tank tank;

    public TankTimeProxy(Tank tank) {
        this.tank = tank;
    }

    @Override
    public void move() {
        long start = System.currentTimeMillis();
        tank.move();
        long end = System.currentTimeMillis();
        System.out.println("坦克移动时间为："+(end - start));
    }
}

class TankLogProxy implements Movabel {

    Tank tank;

    public TankLogProxy(Tank tank) {
        this.tank = tank;
    }

    @Override
    public void move() {
        System.out.println("start moving...");
        tank.move();
        System.out.println("stopped!");
    }
}

interface Movabel{
    void move();
}

