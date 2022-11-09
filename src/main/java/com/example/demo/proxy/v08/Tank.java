package com.example.demo.proxy.v08;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Random;

/**
 *  问题：我想记录坦克的移动时间
 *  最简单的方法：修改代码，记录时间
 *  问题2：如果无法改变方法源码呢？
 *  用继承？
 *  v05:使用代理
 *  v06:代理有各种类型
 *  问题：如何实现代理的各种组合？继承？Decorator?
 *  v07:代理的对象改成Movable类型—越来越像 decorator 了
 *
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
        Tank tank = new Tank();

        //reflection  通过二进制字节码分析类的属性和方法

        Movabel m = (Movabel)Proxy.newProxyInstance(Tank.class.getClassLoader(),
                new Class[]{Movabel.class}, //tank.class.getInterfaces()
                new LogHandler(tank));

        m.move();
    }
}

class LogHandler implements InvocationHandler{

    Tank tank;

    public LogHandler(Tank tank) {
        this.tank = tank;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("method " + method.getName() + " start..");
        Object o = method.invoke(tank, args);
        System.out.println("method " + method.getName() + " end!");
        return o;

    }
}

interface Movabel{
    void move();
}


































