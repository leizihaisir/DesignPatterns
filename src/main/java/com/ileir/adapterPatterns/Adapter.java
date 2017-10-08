package com.ileir.adapterPatterns;

/**
 * 类的适配器模式把适配的类的API转换成为目标类的API。
 * <p>
 * 通过Adapter类，将Source中的方法适配到目标接口Targetable
 * <p>
 * Created by zihailei on 2017/10/8.
 */
public class Adapter extends Source implements Targetable {

    public void method2() {
        System.out.println("this is the targetable method!");
    }
}
