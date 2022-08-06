package com.company;

public class Magic extends Hero{
    public Magic(int health, int damage) {
        super(health, damage);
    }

    @Override
    public String applySuperAbility(String superAbilityType) {
        System.out.println("Маг применил спсобность: "+superAbilityType);
        return superAbilityType;
    }
}
