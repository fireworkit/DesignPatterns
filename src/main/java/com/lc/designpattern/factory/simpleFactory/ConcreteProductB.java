package com.lc.designpattern.factory.simpleFactory;

/**
 * @author lc
 * @description
 * @date 2024/6/14
 */
public class ConcreteProductB implements Product{

    @Override
    public void use() {
        System.out.println("Using Product B");
    }
}
