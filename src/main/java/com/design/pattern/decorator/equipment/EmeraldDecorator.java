package com.design.pattern.decorator.equipment;

public class EmeraldDecorator extends WeaponDecorator{
    public EmeraldDecorator(Weapon weapon) {
        super(weapon);
    }

    @Override
    public String getWeaponName() {
        return super.getWeaponName()+"镶嵌一颗绿宝石";
    }

    @Override
    public int getAgile() {
        return super.getAgile()+100;
    }
}
