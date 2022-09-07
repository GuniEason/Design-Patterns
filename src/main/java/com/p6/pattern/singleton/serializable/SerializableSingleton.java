package com.p6.pattern.singleton.serializable;

import java.io.Serializable;

public class SerializableSingleton implements Serializable {

    private static final SerializableSingleton instance = new SerializableSingleton();

    private SerializableSingleton(){

    }

    public static SerializableSingleton getInstance(){
        return instance;
    }

    private Object readResolve(){ return instance;}

}
