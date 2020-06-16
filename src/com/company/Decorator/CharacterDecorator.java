package com.company.Decorator;

import com.company.Component.Character;

public abstract class CharacterDecorator implements Character {
    protected Character character;
    public CharacterDecorator(Character character){
        this.character = character;
    }
    @Override
    public void displayAttack(){
        this.character.displayAttack();
    }
}
