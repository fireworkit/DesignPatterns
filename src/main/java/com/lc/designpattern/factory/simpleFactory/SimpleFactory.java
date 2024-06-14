package com.lc.designpattern.factory.simpleFactory;

/**
 * @author lc
 * @description
 * @date 2024/6/14
 */
public class SimpleFactory {
    public static Product createProduct(String type) {
        if (type.equals("A")) {
            return new ConcreteProductA();
        } else if (type.equals("B")) {
            return new ConcreteProductB();
        }
        throw new IllegalArgumentException("Unknown product type");
    }
}
