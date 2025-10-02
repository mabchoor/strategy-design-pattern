# Strategy Design Pattern Example

This repository provides a simple Java implementation of the Strategy design pattern. The example is a small, interactive text-based application where different characters can be equipped with various weapons, and their combat behavior can be changed at runtime.

## About The Strategy Pattern

The Strategy pattern is a behavioral design pattern that enables selecting an algorithm at runtime. Instead of implementing a single algorithm directly, code receives run-time instructions as to which in a family of algorithms to use.

In this project, the pattern is used to manage the weapon behavior of characters:

*   **Context:** The `Personnage` (Character) class is the context. It maintains a reference to a Strategy object but is independent of how the strategy is implemented.
*   **Strategy Interface:** The `ComportementArme` (WeaponBehavior) interface defines the common method (`utiliserArme`) that all concrete strategies must implement.
*   **Concrete Strategies:** Classes like `ComportementHache` (AxeBehavior), `ComportementPoignard` (DaggerBehavior), and `ComportementArcEtFleches` (BowAndArrowBehavior) are the concrete strategies. Each one provides a specific implementation for using a weapon.

This setup allows a `Personnage` object to change its weapon (and thus its combat behavior) dynamically during the program's execution without altering the character's class code.

## Project Structure

The main components of this demonstration are:

*   `Main.java`: The entry point of the application. It contains the interactive command-line interface for choosing characters and weapons.
*   `Personnage.java`: An abstract class representing a character. It holds a reference to a `ComportementArme`.
    *   Subclasses: `Roi` (King), `Reine` (Queen), `Chevalier` (Knight), `Troll`.
*   `ComportementArme.java`: The Strategy interface that defines the action of using a weapon.
    *   Implementations: `ComportementHache`, `ComportementPoignard`, `ComportementArcEtFleches`.

## Getting Started

### Prerequisites

*   Java Development Kit (JDK) 21 or later
*   Apache Maven

### Running the Application

1.  **Clone the repository:**
    ```sh
    git clone https://github.com/mabchoor/strategy-design-pattern.git
    cd strategy-design-pattern
    ```

2.  **Compile the project:**
    ```sh
    mvn compile
    ```

3.  **Run the application:**
    ```sh
    mvn exec:java -Dexec.mainClass="org.example.Main"
    ```

## Example Usage

Once the application is running, you can interact with it through the console. You will be prompted to choose a character and a weapon. You can then see the character fight or choose to change the character or weapon.

```
Choisissez un personnage :
1. Roi
2. Reine
3. Chevalier
4. Troll
Votre choix : 1

Choisissez une arme :
1. Hache
2. Poignard
3. Arc et flèches
Votre choix : 3

>>> Le roi : utilise un arc et des flèches !

Que voulez-vous faire ?
1. Changer d’arme
2. Changer de personnage
3. Quitter
Votre choix : 1

Choisissez une arme :
1. Hache
2. Poignard
3. Arc et flèches
Votre choix : 1

>>> Le roi : utilise une hache !

Que voulez-vous faire ?
1. Changer d’arme
2. Changer de personnage
3. Quitter
Votre choix : 3
Fin du jeu !
