
package org.example;

public abstract class Personnage {
    protected ComportementArme arme;

    public void setArme(ComportementArme a) {
        this.arme = a;
    }

    public abstract void combattre();
}
