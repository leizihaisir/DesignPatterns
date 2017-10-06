package com.ileir.singletonPatterns;

/**
 * Created by zihailei on 2017/10/6.
 */
public class LazySingletonThreadSafety {
    private static LazySingletonThreadSafety lazySingletonThreadSafety;

    //私有化默认构造方法，防止方法外的new操作
    private LazySingletonThreadSafety() {
    }

    // 此种效率较低，大部分情况不需要同步操作
    public static synchronized LazySingletonThreadSafety getInstance() {
        if (null == lazySingletonThreadSafety) {
            lazySingletonThreadSafety = new LazySingletonThreadSafety();
        }
        return lazySingletonThreadSafety;
    }
}
