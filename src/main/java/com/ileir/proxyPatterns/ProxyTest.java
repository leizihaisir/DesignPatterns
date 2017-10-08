package com.ileir.proxyPatterns;

/**
 * Created by zihailei on 2017/10/8.
 */
public class ProxyTest {

    public static void main(String[] args) {
        Sourceable source = new Proxy();
        source.method();
    }
}
