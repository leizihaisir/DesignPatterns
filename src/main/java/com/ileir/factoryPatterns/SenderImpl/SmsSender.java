package com.ileir.factoryPatterns.SenderImpl;

import com.ileir.factoryPatterns.SenderInterface.Sender;

/**
 * Created by zihailei on 2017/10/6.
 */
public class SmsSender implements Sender {
    public void send() {
        System.out.printf("Sms sender!");
    }
}
