package com.lc.designpattern.factory.factoryMethod;


import com.lc.designpattern.factory.simpleFactory.Product;

/**
 * @author lc
 * @description
 * @date 2024/6/14
 */
abstract class Factory {

    public abstract Product createProduct();

    public void someOperation() {
        // 使用产品
        Product product = createProduct();
        product.use();
    }
}
