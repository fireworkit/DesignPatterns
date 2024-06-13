package com.lc.designpattern.decorator;

/**
 * @author lc
 * @date 2024/6/13
 */
public abstract  class ShapeDecorator  implements Shape{
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }
    public void draw() {
        decoratedShape.draw();
    }
}
