package com.ileir.factoryPatterns.abstractFactory;

import com.ileir.factoryPatterns.SenderImpl.MailSender;
import com.ileir.factoryPatterns.SenderInterface.Sender;

/**
 * Created by zihailei on 2017/10/6.
 */
public class MailProvider implements Provider {
    public Sender produce() {
        return new MailSender();
    }
}
