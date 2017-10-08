package com.ileir.proxyPatterns;

import com.ileir.decorator.Sourceable;

/**
 * Created by zihailei on 2017/10/8.
 */
public class Source implements Sourceable {
    public void method() {
        System.out.println("the original method!");
    }
}
