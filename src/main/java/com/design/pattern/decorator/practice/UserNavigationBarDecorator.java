package com.design.pattern.decorator.practice;

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
