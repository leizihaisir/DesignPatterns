package com.ileir.factoryPatterns.abstractFactory;

import com.ileir.factoryPatterns.SenderInterface.Sender;

/**
 * Created by zihailei on 2017/10/6.
 */
public interface Provider {

    Sender produce();
}
