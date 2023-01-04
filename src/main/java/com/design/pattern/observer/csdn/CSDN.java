package com.design.pattern.observer.csdn;


import java.util.Observable;

/**
 * 载体
 */
public class CSDN extends Observable {


    private static final CSDN csdn = new CSDN();
    private String name = "CSND社区";

    private CSDN() {
    }

    public static CSDN getInstance() {
        return csdn;
    }

    public String getName() {
        return name;
    }

    public void publishQuestion(Question question) {
        System.out.println(question.getUserName() + "在" + name + "上提交了一个问题。");
        setChanged();
        //通知观察者
        notifyObservers(question);
    }
}
