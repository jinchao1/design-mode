package com.example.demo.chainofresponsibility;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: jinchao
 * @Date: 2022/11/2 - 21:08
 * @Description:  设计模式之责任链模式
 * @version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        Msg msg = new Msg();
        msg.setMsg("大家好:),<script>,欢迎访问mashibing.com，大家都是996");

        //处理msg
//        new HTMLFilter().doFilter(msg);
//        new SensitiveFilter().doFilter(msg);

//        List<Filter> filters = new ArrayList<>();
//        filters.add(new HTMLFilter());
//        filters.add(new SensitiveFilter());
//        for (Filter filter : filters) {
//            filter.doFilter(msg);
//        }

        FilterChain filterChain = new FilterChain();
        filterChain.addFilter(new HTMLFilter())
                .addFilter(new SensitiveFilter());


        FilterChain filterChain2 = new FilterChain();
        filterChain2.addFilter(new FaceFilter())
                .addFilter(new URLFilter());
        filterChain.addFilter(filterChain2);

        filterChain.doFilter(msg);
        System.out.println(msg.getMsg());

    }
}

class Msg{
    String name;
    String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Msg{" +
                "name='" + name + '\'' +
                ", msg='" + msg + '\'' +
                '}';
    }
}

interface Filter{
    boolean doFilter(Msg msg);
}


class HTMLFilter implements Filter{
    @Override
    public boolean doFilter(Msg msg) {
        String m = msg.getMsg();
        m = m.replace("<","{");
        m = m.replace(">","}");
        msg.setMsg(m);
        return true;
    }
}

class SensitiveFilter implements Filter{
    @Override
    public boolean doFilter(Msg msg) {
        String m = msg.getMsg();
        m = m.replace("996","955");
        msg.setMsg(m);
        return false;
    }
}

class FaceFilter implements Filter{
    @Override
    public boolean doFilter(Msg msg) {
        String m = msg.getMsg();
        m = m.replace(":)","^V^");
        msg.setMsg(m);
        return true;
    }
}

class URLFilter implements Filter{
    @Override
    public boolean doFilter(Msg msg) {
        String m = msg.getMsg();
        m = m.replace("mashibing.com","http://www.mashibing.com");
        msg.setMsg(m);
        return true;
    }
}

class FilterChain implements Filter{
    List<Filter> filters = new ArrayList<>();

    public FilterChain addFilter(Filter f){
        filters.add(f);
        return this;
    }

    public boolean doFilter(Msg msg){
        for (Filter filter : filters) {
            if(!filter.doFilter(msg)) return false;
        }
        return true;
    }

}























