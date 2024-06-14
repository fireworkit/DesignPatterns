package com.lc.designpattern.factory.factoryMethod;

/**
 * @author lc
 * @description
 * @date 2024/6/14
 */
public class FactoryMethodDemo {
    public static void main(String[] args) {
        Factory factoryA = new ConcreteFactoryA();
        factoryA.someOperation();

        Factory factoryB = new ConcreteFactoryB();
        factoryB.someOperation();
    }
}
