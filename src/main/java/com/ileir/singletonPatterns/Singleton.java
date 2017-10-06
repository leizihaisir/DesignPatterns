package com.ileir.singletonPatterns;

/**
 * 懒汉模式，线程安全且效率最好，可在生产中使用
 * <p>
 * Created by zihailei on 2017/10/6.
 */
public class Singleton {
    private static Singleton singleton;

    // 私有化构造方法
    private Singleton() {
    }

    // 双重校验锁
    public static Singleton getInstance() {
        if (null == singleton) {
            synchronized (Singleton.class) {
                if (null == singleton) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

}
