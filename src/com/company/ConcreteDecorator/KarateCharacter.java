package com.company.ConcreteDecorator;

import com.company.Component.Character;
import com.company.Decorator.CharacterDecorator;

public class KarateCharacter extends CharacterDecorator {
    public KarateCharacter(Character character) {
        super(character);
    }
    @Override
    public void displayAttack() {
        character.displayAttack();
        displayKarateAttack();
    }
    private void displayKarateAttack(){
        System.out.println("karate attack...");
    }
}
