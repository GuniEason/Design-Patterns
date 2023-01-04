package com.design.pattern.decorator.equipment;

public class BaseWeapon extends Weapon {

    private final String name;

    private final int damage;

    private final int agile;

    private final int intellect;

    public BaseWeapon(String name, int damage, int agile, int intellect) {
        this.name = name;
        this.damage = damage;
        this.agile = agile;
        this.intellect = intellect;
    }

    @Override
    public String getWeaponName() {
        return this.name;
    }

    @Override
    public int getDamage() {
        return this.damage;
    }

    @Override
    public int getAgile() {
        return this.agile;
    }

    @Override
    public int getIntellect() {
        return this.intellect;
    }
}
