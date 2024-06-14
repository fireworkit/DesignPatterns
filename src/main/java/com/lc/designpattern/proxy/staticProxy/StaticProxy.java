package com.lc.designpattern.proxy.staticProxy;

import com.lc.designpattern.proxy.RealSubject;
import com.lc.designpattern.proxy.Subject;

/**
 * @author lc
 * @description
 * @date 2024/6/14
 */
public class StaticProxy implements Subject {
    private RealSubject realSubject;
    @Override
    public void request() {
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        System.out.println("Proxy: Logging before request.");
        realSubject.request();
        System.out.println("Proxy: Logging after request.");
    }
}
