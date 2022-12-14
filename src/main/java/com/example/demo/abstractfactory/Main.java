package com.example.demo.abstractfactory;

/**
 * @Auther: jinchao
 * @Date: 2022/10/30 - 21:39
 * @Description: com.example.demo.factorymethod
 * @version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        /*Car c = new Car();
        c.go();
        AK47 ak47 = new AK47();
        ak47.shoot();
        Bread bread = new Bread();
        bread.printName();*/

        AbstractFactory factory = new ModernFactory();
        Vehicle c = factory.createVehicle();
        c.go();
        Food b = factory.createFood();
        b.printName();
        Weapon ak47 = factory.createWeapon();
        ak47.shoot();


    }
}
