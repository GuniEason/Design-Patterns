package com.design.test.observer.guava;

import com.design.pattern.observer.guava.Pojo;
import com.design.pattern.observer.guava.PojoEvent;
import com.design.pattern.observer.guava.VoEvent;
import com.google.common.eventbus.EventBus;

public class Test {

    public static void main(String[] args) {
        //消息总线
        EventBus eventBus = new EventBus();


        PojoEvent guavaEvent = new PojoEvent();
        VoEvent voEvent = new VoEvent();
        eventBus.register(guavaEvent);
        eventBus.register(voEvent);

        eventBus.post(new Pojo("Tom"));
    }
}
