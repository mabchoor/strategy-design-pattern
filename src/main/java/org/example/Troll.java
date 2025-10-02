package org.example;

public class Troll extends Personnage {
    @Override
    public void combattre() {
        System.out.print("Le troll : ");
        if (arme != null) {
            arme.utiliserArme();
        } else {
            System.out.println("n'a pas d'arme.");
        }
    }
}
