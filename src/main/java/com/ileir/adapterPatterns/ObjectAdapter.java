package com.ileir.adapterPatterns;

/**
 * 对象的适配器模式中适配器类持有Source类的实例，不继承Source，以达到解决兼容性的问题
 * <p>
 * Created by zihailei on 2017/10/8.
 */
public class ObjectAdapter implements Targetable {

    private Source source;

    public ObjectAdapter(Source source) {
        super();
        this.source = source;
    }

    public void method1() {
        source.method1();
    }

    public void method2() {
        System.out.println("this is the ObjectAdapter targetable method!");
    }
}
