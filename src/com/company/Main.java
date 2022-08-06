package com.company;

public class Main {

    public static void main(String[] args) {
        Medic medic = new Medic(200, 23);
        Magic magic = new Magic(300, 22);
        Warrior warrior = new Warrior(500, 59);

        String magical = magic.setSuperAbility("ОГНЕННЫЙ ШАР");
        String medical = medic.setSuperAbility("ЛЕЧЕНИЕ");
        String warrior01 = warrior.setSuperAbility("КРИТИЧЕСКИЙ УРОН ");
        String[] heroesAbility = {magical,medical,warrior01};
        HavingSuperAbility[] havingSuperAbilities = {magic,medic,warrior};

        for (int i = 0; i < heroesAbility.length; i++) {
            havingSuperAbilities[i].applySuperAbility(heroesAbility[i]);
        }


        }
    }
