package com.example.demo.flyweight;

/**
 * @Auther: jinchao
 * @Date: 2022/11/6 - 23:40
 * @Description:  用了享元模式
 * @version: 1.0
 */
public class TestString {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        String s3 = new String("abc");
        String s4 = new String("abc");

        System.out.println(s1 == s2); //true
        System.out.println(s1 == s3); //false
        System.out.println(s3 == s4); //false
        System.out.println(s3.intern() == s1); // true
        System.out.println(s3.intern() == s4.intern()); //true
    }
}





















