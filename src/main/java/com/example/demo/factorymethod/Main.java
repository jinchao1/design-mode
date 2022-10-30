package com.example.demo.factorymethod;

/**
 * @Auther: jinchao
 * @Date: 2022/10/30 - 21:39
 * @Description: com.example.demo.factorymethod
 * @version: 1.0
 */
public class Main {
    public static void main(String[] args) {
//        Car c = new Car();
//        c.go();

//        Plane p = new Plane();
//        p.go();

//        Moveable m = new Plane();
//        m.go();

        Moveable m = new CarFactory().create();
        m.go();

    }
}
