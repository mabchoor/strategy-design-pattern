package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Personnage personnage = choisirPersonnage(scanner);
        personnage.setArme(choisirArme(scanner));

        boolean continuer = true;
        while (continuer) {
            System.out.print("\n>>> ");
            personnage.combattre();

            System.out.println("\nQue voulez-vous faire ?");
            System.out.println("1. Changer d’arme");
            System.out.println("2. Changer de personnage");
            System.out.println("3. Quitter");
            System.out.print("Votre choix : ");
            int choix = lireEntier(scanner);

            switch (choix) {
                case 1 -> {
                    ComportementArme nouvelleArme = choisirArme(scanner);
                    personnage.setArme(nouvelleArme);
                }
                case 2 -> {
                    personnage = choisirPersonnage(scanner);
                    personnage.setArme(choisirArme(scanner));
                }
                case 3 -> continuer = false;
                default -> System.out.println("Choix invalide !");
            }
        }

        System.out.println("Fin du jeu !");
        scanner.close();
    }

    // ----------------- Helpers -------------------

    private static Personnage choisirPersonnage(Scanner scanner) {
        System.out.println("\nChoisissez un personnage :");
        System.out.println("1. Roi");
        System.out.println("2. Reine");
        System.out.println("3. Chevalier");
        System.out.println("4. Troll");
        System.out.print("Votre choix : ");
        int choix = lireEntier(scanner);

        return switch (choix) {
            case 1 -> new Roi();
            case 2 -> new Reine();
            case 3 -> new Chevalier();
            case 4 -> new Troll();
            default -> {
                System.out.println("Choix invalide, utilisation de Roi par défaut.");
                yield new Roi();
            }
        };
    }

    private static ComportementArme choisirArme(Scanner scanner) {
        System.out.println("\nChoisissez une arme :");
        System.out.println("1. Hache");
        System.out.println("2. Poignard");
        System.out.println("3. Arc et flèches");
        System.out.print("Votre choix : ");
        int choix = lireEntier(scanner);

        return switch (choix) {
            case 1 -> new ComportementHache();
            case 2 -> new ComportementPoignard();
            case 3 -> new ComportementArcEtFleches();
            default -> {
                System.out.println("Choix invalide, utilisation de Hache par défaut.");
                yield new ComportementHache();
            }
        };
    }

    private static int lireEntier(Scanner scanner) {
        int nombre;
        try {
            nombre = Integer.parseInt(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            return -1;
        }
        return nombre;
    }
}
