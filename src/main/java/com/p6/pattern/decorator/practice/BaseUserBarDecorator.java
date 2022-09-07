package com.p6.pattern.decorator.practice;

public class BaseUserBarDecorator extends UserNavigationBar{

    private final User user;

    public BaseUserBarDecorator(User user) {
        this.user = user;
    }

    @Override
    public User getUserBar() {
        return this.user;
    }

}
