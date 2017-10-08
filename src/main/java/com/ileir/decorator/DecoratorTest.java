package com.ileir.decorator;

/**
 * Created by zihailei on 2017/10/8.
 */
public class DecoratorTest {

    public static void main(String[] args) {
        Source source = new Source();
        Sourceable sourceable = new Decorator(source);
        sourceable.method();
    }
}
