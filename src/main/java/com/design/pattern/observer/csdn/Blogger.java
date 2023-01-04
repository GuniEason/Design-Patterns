package com.design.pattern.observer.csdn;


import java.util.Observable;
import java.util.Observer;

public class Blogger implements Observer {

    private String name;

    public Blogger(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        CSDN csdn = (CSDN) o;
        Question question = (Question) arg;
        System.out.println(name + "老师，你好！\n" +
                "您收到了一个来自" + csdn.getName() + "的提问，希望您解答。问题内容如下：\n" +
                question.getContent() + "\n" +
                "提问者：" + question.getUserName());
    }
}
