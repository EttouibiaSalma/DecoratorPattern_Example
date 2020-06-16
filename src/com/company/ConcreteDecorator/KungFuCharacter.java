package com.company.ConcreteDecorator;

import com.company.Component.Character;
import com.company.Decorator.CharacterDecorator;

public class KungFuCharacter extends CharacterDecorator {
    public KungFuCharacter(Character character) {
        super(character);
    }
    @Override
    public void displayAttack() {
        character.displayAttack();
        displayFungFuAttack();
    }
    private void displayFungFuAttack(){
        System.out.println("kung fu attack...");
    }
}
