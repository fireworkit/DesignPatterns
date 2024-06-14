package com.lc.designpattern.singleton;

/**
 * @author lc
 * @description  静态内部类
 * @date 2024/6/14
 */
public class StaticInnerClassSingleton {

        // 私有构造函数，防止外部实例化
        private StaticInnerClassSingleton() {}

        // 静态内部类，只有在调用 getInstance() 时才会加载
        private static class SingletonHelper {
            private static final StaticInnerClassSingleton INSTANCE = new StaticInnerClassSingleton();
        }

        // 提供全局访问点
        public static StaticInnerClassSingleton getInstance() {
            return SingletonHelper.INSTANCE;
        }
    }

