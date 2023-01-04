package com.design.pattern.decorator.practice;

public class EssayBar extends UserNavigationBarDecorator{
    public EssayBar(UserNavigationBar userNavigationBar) {
        super(userNavigationBar);
    }


    @Override
    public User getUserBar() {
        User userBar = super.getUserBar();
        userBar.getBarList().add(new Navigation("文章","/EssayBar"));
        return userBar;
    }
}
