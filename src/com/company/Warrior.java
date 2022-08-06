package com.company;

public class Warrior extends Hero{
    public Warrior(int health, int damage) {
        super(health, damage );
    }

    @Override
    public String applySuperAbility(String superAbilityType) {
        System.out.println("Воин применил способность: "+superAbilityType);
        return superAbilityType;
    }
}
