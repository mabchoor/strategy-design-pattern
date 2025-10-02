package org.example;

public class Reine extends Personnage {
    @Override
    public void combattre() {
        System.out.print("La reine : ");
        if (arme != null) {
            arme.utiliserArme();
        } else {
            System.out.println("n'a pas d'arme.");
        }
    }
}
