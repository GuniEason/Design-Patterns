package com.design.pattern.decorator.equipment;

public class WeaponDecorator extends Weapon{

    private Weapon weapon;

    public WeaponDecorator(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public String getWeaponName() {
        return weapon.getWeaponName();
    }

    @Override
    public int getDamage() {
        return weapon.getDamage();
    }

    @Override
    public int getAgile() {
        return weapon.getAgile();
    }

    @Override
    public int getIntellect() {
        return weapon.getIntellect();
    }
}
