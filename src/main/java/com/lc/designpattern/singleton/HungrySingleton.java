package com.lc.designpattern.singleton;

/**
 * @author lc
 * @description 饿汉式
 * @date 2024/6/14
 */
public class HungrySingleton {
    // 在类加载时创建实例
    private static final HungrySingleton instance = new HungrySingleton();

    // 私有构造函数，防止外部实例化
    private HungrySingleton() {}

    // 提供全局访问点
    public static HungrySingleton getInstance() {
        return instance;
    }


    public static void main(String[] args) {
        for (int i = 0; i <20 ; i++) {
            new Thread(()->{
                System.out.println(HungrySingleton.getInstance().hashCode());
            }).start();
        }
    }

}
