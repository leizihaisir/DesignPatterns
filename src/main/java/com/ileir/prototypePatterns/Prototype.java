package com.ileir.prototypePatterns;

import java.io.*;
import java.util.Map;

/**
 * Created by zihailei on 2017/10/6.
 */

public class Prototype implements Cloneable, Serializable {

    private String userName;

    private String password;

    private Map<String, Object> userStatis;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Map<String, Object> getUserStatis() {
        return userStatis;
    }

    public void setUserStatis(Map<String, Object> userStatis) {
        this.userStatis = userStatis;
    }

    // 浅复制，基本数据类型的变量都会重新创建，而引用类型，指向的还是原对象所指向的
    public Object shallowClone() {
        Prototype proto = null;
        try {
            proto = (Prototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return proto;
    }

    // 深复制，不论是基本数据类型还有引用类型，都是重新创建的
    public Object deepClone() throws IOException, ClassNotFoundException {

        // 写入当前对象的二进制流
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(this);

        // 读出二进制流产生的新对象
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());

        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        return objectInputStream.readObject();
    }
}
