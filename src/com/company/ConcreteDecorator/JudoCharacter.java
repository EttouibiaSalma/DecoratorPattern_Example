package com.company.ConcreteDecorator;

import com.company.Component.Character;
import com.company.Decorator.CharacterDecorator;

public class JudoCharacter extends CharacterDecorator {
    public JudoCharacter(Character character) {
        super(character);
    }
    @Override
    public void displayAttack() {
        character.displayAttack();
        displayJudoAttack();
    }
    private void displayJudoAttack(){
        System.out.println("judo attack...");
    }
}
