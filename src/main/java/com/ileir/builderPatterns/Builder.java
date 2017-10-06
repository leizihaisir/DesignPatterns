package com.ileir.builderPatterns;

import com.ileir.factoryPatterns.SenderImpl.MailSender;
import com.ileir.factoryPatterns.SenderImpl.SmsSender;
import com.ileir.factoryPatterns.SenderInterface.Sender;

import java.util.ArrayList;
import java.util.List;

/**
 * 建造者模式，相当于工厂模式的集合
 * <p>
 * Created by zihailei on 2017/10/6.
 */
public class Builder {

    private List<Sender> senderList = new ArrayList<Sender>();

    public List<Sender> produceMailSender(int count) {
        for (int i = 0; i < count; i++) {
            senderList.add(new MailSender());
        }
        return senderList;
    }

    public List<Sender> produceSmsSender(int count) {
        for (int i = 0; i < count; i++) {
            senderList.add(new SmsSender());
        }
        return senderList;
    }
}
