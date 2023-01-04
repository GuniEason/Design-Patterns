package com.design.pattern.decorator.equipment;

public class RubyDecorator extends WeaponDecorator{


    public RubyDecorator(Weapon weapon) {
        super(weapon);
    }

    @Override
    public String getWeaponName() {
        return super.getWeaponName()+"镶嵌一颗红宝石";
    }

    @Override
    public int getDamage() {
        return super.getDamage()+100;
    }

}
