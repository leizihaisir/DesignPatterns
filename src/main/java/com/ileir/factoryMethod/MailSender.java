package com.ileir.factoryMethod;

/**
 * Created by zihailei on 2017/10/6.
 */
public class MailSender implements Sender {

    public void send() {
        System.out.printf("mail sender!");
    }
}
