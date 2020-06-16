package com.company.ConcreteDecorator;

import com.company.Component.Character;
import com.company.Decorator.CharacterDecorator;

public class TaeKwonDoCharacter extends CharacterDecorator {
    public TaeKwonDoCharacter(Character character){
        super(character);
    }
    @Override
    public void displayAttack() {
        character.displayAttack();
        displayTaeKwonDoAttack();
    }
    private void displayTaeKwonDoAttack(){
        System.out.println("tae kwon do attack...");
    }
}
