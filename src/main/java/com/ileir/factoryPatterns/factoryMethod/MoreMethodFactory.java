package com.ileir.factoryPatterns.factoryMethod;

import com.ileir.factoryPatterns.SenderImpl.MailSender;
import com.ileir.factoryPatterns.SenderImpl.SmsSender;
import com.ileir.factoryPatterns.SenderInterface.Sender;

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
