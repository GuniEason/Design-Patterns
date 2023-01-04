package com.design.test.observer.general;


import com.design.pattern.observer.general.ConcreteObserver;
import com.design.pattern.observer.general.ConcreteSubject;
import com.design.pattern.observer.general.IObserver;
import com.design.pattern.observer.general.ISubject;

public class Test {

    public static void main(String[] args) {
        // 被观察者
        ISubject<String> observable = new ConcreteSubject<String>();
        // 观察者
        IObserver<String> observer = new ConcreteObserver<String>();
        // 注册
        observable.attach(observer);
        // 通知
        observable.notify("hello");
    }

}
