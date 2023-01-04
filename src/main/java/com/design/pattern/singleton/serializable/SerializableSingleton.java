package com.design.pattern.singleton.serializable;

import java.io.Serializable;

public class SerializableSingleton implements Serializable {

    private static final SerializableSingleton instance = new SerializableSingleton();

    private SerializableSingleton(){

    }

    public static SerializableSingleton getInstance(){
        return instance;
    }

    //防止序列化" readResole"
    private Object readResolve(){ return instance;}

}
