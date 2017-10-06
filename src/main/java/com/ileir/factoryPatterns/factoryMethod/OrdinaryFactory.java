package com.ileir.factoryPatterns.factoryMethod;

import com.ileir.factoryPatterns.SenderImpl.MailSender;
import com.ileir.factoryPatterns.SenderImpl.SmsSender;
import com.ileir.factoryPatterns.SenderInterface.Sender;

/**
 * Created by zihailei on 2017/10/6.
 */
public class OrdinaryFactory {

    public Sender produce(String senderType) {

        if ("mail".equals(senderType)) {
            return new MailSender();
        } else if ("sms".equals(senderType)) {
            return new SmsSender();
        } else {
            System.out.println("请输入正确的类型!");
        }
        return null;
    }
}
