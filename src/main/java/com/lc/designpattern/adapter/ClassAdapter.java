package com.lc.designpattern.adapter;

/**
 * @author lc
 * @description
 * @date 2024/6/14
 */
public class ClassAdapter extends Adaptee implements Target {


    @Override
    public void request() {
        specificRequest();
    }
}
