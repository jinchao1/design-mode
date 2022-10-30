package com.example.demo.factorymethod;

/**
 * @Auther: jinchao
 * @Date: 2022/10/30 - 21:59
 * @Description:
 *    任意制定生产过程：XXXFactory.create()
 * @version: 1.0
 */
public class CarFactory {
    public Moveable create(){
        System.out.println("a car created!");
        return new Car();
    }
}
