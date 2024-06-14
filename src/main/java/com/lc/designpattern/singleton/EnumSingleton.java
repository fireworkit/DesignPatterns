package com.lc.designpattern.singleton;

/**
 * @author lc
 * @description 枚举单例
 * @date 2024/6/14
 */
public enum EnumSingleton {


    INSTANCE;
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
    public static EnumSingleton getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        EnumSingleton.getInstance().setData("你好");
    }
}
