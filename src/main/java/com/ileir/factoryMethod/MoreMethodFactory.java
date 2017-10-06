package com.ileir.factoryMethod;

/**
 * Created by zihailei on 2017/10/6.
 */
public class MoreMethodFactory {

    //factory方法先要实例化才能使用
    public Sender getMailSender() {
        return new MailSender();
    }

    public Sender getSmsSender() {
        return new SmsSender();
    }
}
