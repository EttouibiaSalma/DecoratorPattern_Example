package com.company.ConcreteComponent;


import com.company.Component.Character;

public class CharacterImpl implements Character {

    @Override
    public void displayAttack() {
        System.out.println("basic attack...");
    }
}
