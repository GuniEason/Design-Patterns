package com.p6.pattern.decorator.practice;

public class HomeWorkBar extends UserNavigationBarDecorator{

    public HomeWorkBar(UserNavigationBar userNavigationBar) {
        super(userNavigationBar);
    }

    @Override
    public User getUserBar() {
        User userBar = super.getUserBar();
        userBar.getBarList().add(new Navigation("家庭作业","/HomeWork"));
        return userBar;
    }
}
