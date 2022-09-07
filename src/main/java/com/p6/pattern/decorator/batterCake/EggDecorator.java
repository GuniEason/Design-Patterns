package com.p6.pattern.decorator.batterCake;

public class EggDecorator extends BatterCakeDecorator{

    public EggDecorator(BatterCake batterCake) {
        super(batterCake);
    }

    @Override
    public int getPrice() {
        return super.getPrice()+2;
    }

    @Override
    public String getMsg() {
        return super.getMsg()+"加一个鸡蛋";
    }
}
