package com.p6.pattern.decorator.batterCake;

/**
 * 抽象类的基本实现
 */
public class BatterCakeImpl extends BatterCake{

    @Override
    public String getMsg() {
        return "煎饼果子";
    }

    @Override
    public int getPrice() {
        return 5;
    }
}
