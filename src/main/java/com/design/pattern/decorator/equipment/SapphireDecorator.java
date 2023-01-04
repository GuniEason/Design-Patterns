package com.design.pattern.decorator.equipment;

public class SapphireDecorator extends WeaponDecorator{

    public SapphireDecorator(Weapon weapon) {
        super(weapon);
    }

    @Override
    public String getWeaponName() {
        return super.getWeaponName()+"镶嵌一颗蓝宝石";
    }


    @Override
    public int getIntellect() {
        return super.getIntellect()+100;
    }
}
