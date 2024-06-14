package com.lc.designpattern.factory.factoryMethod;

import com.lc.designpattern.factory.simpleFactory.ConcreteProductA;
import com.lc.designpattern.factory.simpleFactory.Product;

/**
 * @author lc
 * @description
 * @date 2024/6/14
 */
public class ConcreteFactoryA  extends Factory{
    @Override
    public Product createProduct() {
            return new ConcreteProductA();
        }
    }

