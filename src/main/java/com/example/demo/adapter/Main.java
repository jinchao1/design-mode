package com.example.demo.adapter;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**  todo:  适配器模式
 * 常见的Adapter类反而不是Adapter模式
 * WindowAdapter
 * KeyAdapter
 */
public class Main {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("c:/test.text");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        String line = br.readLine();
        while (line != null && !line.equals("")) {
            System.out.println(line);
        }
        br.close();


    }
}
