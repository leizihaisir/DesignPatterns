package com.ileir.singletonPatterns;

/**
 * 饿汉模式，getHungrySingleton在类装载时就实例化，无线程安全模式
 * <p>
 * Created by zihailei on 2017/10/6.
 */
public class HungrySingleton {
    private static HungrySingleton hungrySingleton = new HungrySingleton();

    // 私有化单例类的构造方法
    private HungrySingleton() {
    }

    public static HungrySingleton getHungrySingleton() {
        return new HungrySingleton();
    }

}
