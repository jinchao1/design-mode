package com.example.demo.abstractfactory;

/**
 * @Auther: jinchao
 * @Date: 2022/10/31 - 21:25
 * @Description:  抽象工厂
 * @version: 1.0
 */
public abstract class AbstractFactory {
    abstract Food createFood();
    abstract Vehicle createVehicle();
    abstract Weapon createWeapon();
}
