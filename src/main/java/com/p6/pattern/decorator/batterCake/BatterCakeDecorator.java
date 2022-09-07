package com.p6.pattern.decorator.batterCake;

/**
 * 抽象类装饰器
 */
public class BatterCakeDecorator extends BatterCake{


    private  BatterCake batterCake;

    public BatterCakeDecorator(BatterCake batterCake) {
        this.batterCake = batterCake;
    }

    @Override
    public String getMsg() {
        return this.batterCake.getMsg();
    }

    @Override
    public int getPrice() {
        return this.batterCake.getPrice();
    }
}
