package com.lc.designpattern.adapter;

/**
 * @author lc
 * @description
 * @date 2024/6/14
 */
public class ObjectAdapterDemo {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Target target = new ObjectAdapter(adaptee);
        target.request();
    }
}
