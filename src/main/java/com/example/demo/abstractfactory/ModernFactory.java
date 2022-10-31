package com.example.demo.abstractfactory;

/**
 * @Auther: jinchao
 * @Date: 2022/10/31 - 21:35
 * @Description: com.example.demo.abstractfactory
 * @version: 1.0
 */
public class ModernFactory extends AbstractFactory {
    @Override
    Food createFood() {
        return new Bread();
    }

    @Override
    Vehicle createVehicle() {
        return new Car();
    }

    @Override
    Weapon createWeapon() {
        return new AK47();
    }
}
