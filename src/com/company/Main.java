package com.company;

import com.company.Component.Character;
import com.company.ConcreteComponent.CharacterImpl;
import com.company.ConcreteDecorator.JudoCharacter;
import com.company.ConcreteDecorator.KarateCharacter;
import com.company.ConcreteDecorator.KungFuCharacter;
import com.company.ConcreteDecorator.TaeKwonDoCharacter;

public class Main {

    public static void main(String[] args) {
        System.out.println("level 1...");
        Character player = new CharacterImpl();
        player.displayAttack();;
        System.out.println("\nlevel 2...");
        Character kungfuDecorator = new KungFuCharacter(player);
        kungfuDecorator.displayAttack();
        System.out.println("\nlevel 3...");
        Character karateDecorator = new KarateCharacter(kungfuDecorator);
        karateDecorator.displayAttack();
        System.out.println("\nlevel 4...");
        Character judoDecorator = new JudoCharacter(karateDecorator);
        judoDecorator.displayAttack();
        System.out.println("\nlevel 5...");
        Character taeKwonDoDecorator = new TaeKwonDoCharacter(judoDecorator);
        taeKwonDoDecorator.displayAttack();
        /*
        Personnage martialArtist = nouveau KungFuCharacter (
        nouveau TaeKwonDoCharacter (
                nouveau KarateCharacter (
                        nouveau JudoCharacter (
                                nouveau CharacterImpl ()
                        )
                )
        )
       );
       martialArtist.displayAttack ();
         */
    }
}
