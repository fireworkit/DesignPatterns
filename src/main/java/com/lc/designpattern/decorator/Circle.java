package com.lc.designpattern.decorator;

/**
 * @author lc
 * @date 2024/6/13
 */
public class Circle  implements  Shape{
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}
