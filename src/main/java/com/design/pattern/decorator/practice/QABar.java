package com.design.pattern.decorator.practice;

public class QABar extends UserNavigationBarDecorator{

    public QABar(UserNavigationBar userNavigationBar) {
        super(userNavigationBar);
    }

    @Override
    public User getUserBar() {
        User userBar = super.getUserBar();
        userBar.getBarList().add(new Navigation("问答","/QA"));
        return userBar;
    }
}
