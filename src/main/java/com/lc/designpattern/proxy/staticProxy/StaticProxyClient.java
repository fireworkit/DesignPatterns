package com.lc.designpattern.proxy.staticProxy;

import com.lc.designpattern.proxy.Subject;

/**
 * @author lc
 * @description
 * @date 2024/6/14
 */
public class StaticProxyClient {
    public static void main(String[] args) {
        Subject proxy = new StaticProxy();
        proxy.request();
    }
}
