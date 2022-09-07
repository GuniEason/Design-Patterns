package com.p6.pattern.decorator.practice;

public class UserNavigationBarDecorator extends UserNavigationBar{

    private UserNavigationBar userNavigationBar;

    public UserNavigationBarDecorator(UserNavigationBar userNavigationBar) {
        this.userNavigationBar = userNavigationBar;
    }

    @Override
    public User getUserBar() {
        return userNavigationBar.getUserBar();
    }
}
