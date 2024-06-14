package com.lc.designpattern.proxy.dynamicProxy;

import com.lc.designpattern.proxy.RealSubject;
import com.lc.designpattern.proxy.Subject;

import java.lang.reflect.Proxy;

/**
 * @author lc
 * @description
 * @date 2024/6/14
 */
public class DynamicProxyClient {
    public static void main(String[] args) {
        RealSubject realSubject = new RealSubject();
        Subject proxyInstance = (Subject) Proxy.newProxyInstance(
            realSubject.getClass().getClassLoader(),
            realSubject.getClass().getInterfaces(),
            new DynamicProxyHandler(realSubject)
        );

        proxyInstance.request();
    }
}
