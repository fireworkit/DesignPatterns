package com.lc.designpattern.factory.abstractFactory;

/**
 * @author lc
 * @description
 * @date 2024/6/14
 */
public class ConcreteFactory2 implements AbstractFactory {

    @Override
    public ProductA createProductA() {
        return new ConcreteProductA2();
    }

    @Override
    public ProductB createProductB() {
        return new ConcreteProductB2();
    }
}
