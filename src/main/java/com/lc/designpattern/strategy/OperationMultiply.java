package com.lc.designpattern.strategy;

/**
 * @author lc
 * @description
 * @date 2024/6/14
 */
public class OperationMultiply implements Strategy{

    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
