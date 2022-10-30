package com.example.demo.factorymethod;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * @Auther: jinchao
 * @Date: 2022/10/30 - 21:55
 * @Description:  简单工厂的可扩展性不好
 * @version: 1.0
 */
public class SimpleVehicleFactory {
    public Car createCar(){
        //前置操作
        return new Car();
    }

    public Plane createPlane(){
        return new Plane();
    }

}
