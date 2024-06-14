package com.lc.designpattern.adapter;

/**
 * @author lc
 * @description
 * @date 2024/6/14
 */
public class ClassAdapterDemo {
    public static void main(String[] args) {
        Target target = new ClassAdapter();
        target.request();
    }
}
