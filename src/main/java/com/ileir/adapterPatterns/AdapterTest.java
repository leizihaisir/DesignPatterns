package com.ileir.adapterPatterns;

/**
 * Created by zihailei on 2017/10/8.
 */
public class AdapterTest {

    public static void main(String[] args) {
        Targetable targetable = new Adapter();
        targetable.method1();
        targetable.method2();
        System.out.println("-----------object adapter--------");
        Source source = new Source();
        Targetable objectTar = new ObjectAdapter(source);
        objectTar.method1();
        objectTar.method2();
    }


}
