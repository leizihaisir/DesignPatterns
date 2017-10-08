package com.ileir.facadePatterns;

/**
 * Created by zihailei on 2017/10/8.
 */
public class User {

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.startup();
        computer.shutdown();
    }
}
