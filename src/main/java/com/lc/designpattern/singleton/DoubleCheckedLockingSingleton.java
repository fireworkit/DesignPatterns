package com.lc.designpattern.singleton;

/**
 * @author lc
 * @description   双重检查锁定
 * @date 2024/6/14
 */
public class DoubleCheckedLockingSingleton {

    // 使用 volatile 修饰防止指令重排序
    private static volatile DoubleCheckedLockingSingleton instance;

    // 私有构造函数，防止外部实例化
    private DoubleCheckedLockingSingleton() {
    }
    public static DoubleCheckedLockingSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckedLockingSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckedLockingSingleton();
                }
            }
        }
        return instance;
    }
}

