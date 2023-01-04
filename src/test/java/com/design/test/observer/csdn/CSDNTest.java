package com.design.test.observer.csdn;

import com.design.pattern.observer.csdn.Blogger;
import com.design.pattern.observer.csdn.CSDN;
import com.design.pattern.observer.csdn.Question;

public class CSDNTest {
    public static void main(String[] args) {
        CSDN csdn = CSDN.getInstance();
        Blogger tom = new Blogger("Tom");
        Blogger jerry = new Blogger("Jerry");

        csdn.addObserver(tom);
        csdn.addObserver(jerry);

        //用户行为
        Question question = new Question();
        question.setUserName("张三");
        question.setContent("观察者模式适用于哪些场景？");

        csdn.publishQuestion(question);
    }
}
