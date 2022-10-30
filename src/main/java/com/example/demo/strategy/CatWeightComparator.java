package com.example.demo.strategy;

/**
 * @Auther: jinchao
 * @Date: 2022/10/30 - 10:12
 * @Description: com.example.demo.strategy
 * @version: 1.0
 */
public class CatWeightComparator implements Comparator<Cat> {

    @Override
    public int compare(Cat o1, Cat o2) {
        if(o1.weight < o2.weight){
            return -1;
        }else if(o1.weight > o2.weight){
            return 1;
        }else {
            return 0;
        }
    }
}
