package org.example;

public class Chevalier extends Personnage {
    @Override
    public void combattre() {
        System.out.print("Le chevalier : ");
        if (arme != null) {
            arme.utiliserArme();
        } else {
            System.out.println("n'a pas d'arme.");
        }
    }
}
