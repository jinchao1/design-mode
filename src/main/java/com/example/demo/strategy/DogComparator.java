package com.example.demo.strategy;

/**
 * @Auther: jinchao
 * @Date: 2022/10/30 - 10:12
 * @Description: com.example.demo.strategy
 * @version: 1.0
 */
public class DogComparator implements Comparator<Dog> {

    @Override
    public int compare(Dog o1, Dog o2) {
        if(o1.food < o2.food){
            return -1;
        }else if(o1.food > o2.food){
            return 1;
        }else {
            return 0;
        }
    }
}
