package com.company;

public class Main {

    public static void main(String[] args) {
        Medic medic = new Medic(200, 23);
        Magic magic = new Magic(300, 22);
        Warrior warrior = new Warrior(500, 59);
        Hero[] myheroes = {medic, magic, warrior};
        for (int i = 0; i < 1; i++) {
            warrior.applySuperAbility("КРИТИЧЕСКИЙ УРОН");
            magic.applySuperAbility("ОГНЕННЫЙ ШАР");
            medic.applySuperAbility("ЛЕЧЕНИЕ");
        }


        }
    }
