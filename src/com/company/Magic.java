package com.company;

public class Magic extends Hero{
    public Magic(int health, int damage) {
        super(health, damage);
    }

    @Override
    public void applySuperAbility(String superAbility) {
        System.out.println("Маг применил спсобность: "+superAbility);
    }
}
