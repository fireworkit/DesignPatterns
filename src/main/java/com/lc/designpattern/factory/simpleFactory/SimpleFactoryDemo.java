package com.lc.designpattern.factory.simpleFactory;

/**
 * @author lc
 * @description
 * @date 2024/6/14
 */
public class SimpleFactoryDemo {

    public static void main(String[] args) {
        Product productA = SimpleFactory.createProduct("A");
        productA.use();

        Product productB = SimpleFactory.createProduct("B");
        productB.use();
    }

}
