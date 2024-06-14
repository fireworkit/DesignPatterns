package com.lc.designpattern.factory.abstractFactory;

/**
 * @author lc
 * @description
 * @date 2024/6/14
 */
public class ConcreteFactory1 implements AbstractFactory {

    @Override
    public ProductA createProductA() {
        return new ConcreteProductA1();
    }

    @Override
    public ProductB createProductB() {
        return new ConcreteProductB1();
    }
}
