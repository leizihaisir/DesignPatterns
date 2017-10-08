package com.ileir.decorator;

/**
 * Source类是被装饰类，Decorator类是一个装饰类，可以为Source类动态的添加一些功能
 * <p>
 * Created by zihailei on 2017/10/8.
 */
public class Decorator implements Sourceable {

    private Sourceable sourceable;

    public Decorator(Sourceable sourceable) {
        this.sourceable = sourceable;
    }

    public void method() {
        System.out.println("before decorator!");
        sourceable.method();
        System.out.println("after decorator!");
    }
}
