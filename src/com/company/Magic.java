package com.company;

public class Magic extends Hero{
    @Override
    public void applySuperAbility(String superAbilityType) {
        System.out.println("Маг применил способность: "+superAbilityType);
    }
}
