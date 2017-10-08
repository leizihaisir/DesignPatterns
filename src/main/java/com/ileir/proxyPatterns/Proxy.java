package com.ileir.proxyPatterns;

/**
 * 代理模式就是多一个代理类出来，替原对象进行一些操作
 * <p>
 * Created by zihailei on 2017/10/8.
 */

public class Proxy implements Sourceable {

    private Source source;

    public Proxy() {
        super();
        this.source = new Source();
    }

    public void method() {

        before();
        source.method();

        after();
    }

    private void before() {
        System.out.println("before proxy!");
    }

    private void after() {
        System.out.println("after proxy!");
    }
}
