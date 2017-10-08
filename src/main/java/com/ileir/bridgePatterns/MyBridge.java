package com.ileir.bridgePatterns;

/**
 * Created by zihailei on 2017/10/8.
 */
public class MyBridge extends Bridge {

    public void method() {
        getSource().method();
    }
}
