package com.ileir.factoryPatterns.factoryMethod;

import com.ileir.factoryPatterns.SenderImpl.MailSender;
import com.ileir.factoryPatterns.SenderImpl.SmsSender;
import com.ileir.factoryPatterns.SenderInterface.Sender;

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
