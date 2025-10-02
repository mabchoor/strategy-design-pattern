package org.example;

public class Roi extends Personnage {
    @Override
    public void combattre() {
        System.out.print("Le roi : ");
        if (arme != null) {
            arme.utiliserArme();
        } else {
            System.out.println("n'a pas d'arme.");
        }
    }
}
