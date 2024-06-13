package com.lc.designpattern.decorator;

/**
 * @description  装饰器模式
 * @author lc
 * @date 2024/6/13
 */
public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());
        System.out.println("Circle with normal border");
        circle.draw();
        System.out.println("Circle of red border");
        redCircle.draw();
    }
}
