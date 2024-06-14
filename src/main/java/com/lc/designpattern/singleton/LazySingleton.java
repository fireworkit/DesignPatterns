package com.lc.designpattern.singleton;

/**
 * @author lc
 * @description 懒汉式
 * @date 2024/6/14
 */
public class LazySingleton {
    // 静态变量保存实例
    private static LazySingleton instance;

    // 私有构造函数，防止外部实例化
    private LazySingleton() {
    }
    // 提供全局访问点，并确保线程安全
    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
