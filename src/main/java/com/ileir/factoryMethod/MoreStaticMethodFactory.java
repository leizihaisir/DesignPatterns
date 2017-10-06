package com.ileir.factoryMethod;

/**
 * Created by zihailei on 2017/10/6.
 */
public class MoreStaticMethodFactory {

    public static Sender getMailSender() {
        return new MailSender();
    }

    public static Sender getSmsSender() {
        return new SmsSender();
    }
}
