package com.lc.designpattern.proxy;

/**
 * @author lc
 * @description
 * @date 2024/6/14
 */
public class RealSubject implements  Subject {
    @Override
    public void request() {
        System.out.println("RealSubject: Handling request.");
    }
}
