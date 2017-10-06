package com.ileir.singletonPatterns;

/**
 * 懒汉单例模式并且线程不安全
 * <p>
 * Created by zihailei on 2017/10/6.
 */
public class LazySingletonThreadInsecurity {

    private static LazySingletonThreadInsecurity lazySingletonThreadInsecurity;

    private LazySingletonThreadInsecurity() {
    }

    public LazySingletonThreadInsecurity getLazySingletonThreadInsecurity() {
        if (null == lazySingletonThreadInsecurity) {
            lazySingletonThreadInsecurity = new LazySingletonThreadInsecurity();
        }
        return lazySingletonThreadInsecurity;
    }
}
