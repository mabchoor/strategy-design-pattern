<div align="center">
  <img height="120" src="https://media.giphy.com/media/L8K62iTDkzGX6/giphy.gif"  />
  
  # ⚔️ Strategy Design Pattern - RPG Combat System
  
  <p>
    <img src="https://img.shields.io/badge/Java-21+-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java" />
    <img src="https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white" alt="Maven" />
    <img src="https://img.shields.io/badge/Design_Pattern-Strategy-blueviolet?style=for-the-badge" alt="Strategy Pattern" />
  </p>

  
  <p><i>A Java implementation demonstrating the Strategy behavioral design pattern through an interactive RPG combat system</i></p>
</div>

---

## 📖 Table of Contents

- [About The Project](#-about-the-project)
- [The Strategy Pattern](#-the-strategy-pattern)
- [Project Architecture](#-project-architecture)
- [Getting Started](#-getting-started)
- [Usage Examples](#-usage-examples)
- [Key Features](#-key-features)
- [UML Diagram](#-uml-diagram)
- [Contributing](#-contributing)
- [License](#-license)
- [Contact](#-contact)

---

## 🎯 About The Project

This repository provides an elegant Java implementation of the **Strategy Design Pattern**. Through an interactive text-based RPG application, users can select different characters (King, Queen, Knight, Troll) and equip them with various weapons, dynamically changing their combat behavior at runtime.

### Why This Project?

- 📚 **Educational**: Perfect for learning behavioral design patterns
- 🎮 **Interactive**: Hands-on experience with pattern implementation
- 🔧 **Practical**: Real-world example of flexible algorithm selection
- 💡 **Clean Code**: Demonstrates SOLID principles and best practices

---

## 🧠 The Strategy Pattern

The **Strategy Pattern** is a behavioral design pattern that enables selecting an algorithm's behavior at runtime. Instead of implementing multiple algorithms directly within a class, the pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable.

### Pattern Components in This Project

```
┌─────────────────────────────────────────────────────────────┐
│                     Strategy Pattern                         │
├─────────────────────────────────────────────────────────────┤
│                                                              │
│  Context (Personnage)                                        │
│  ├─ Maintains reference to Strategy                         │
│  └─ Delegates combat behavior to Strategy                   │
│                                                              │
│  Strategy Interface (ComportementArme)                       │
│  └─ Defines common method: utiliserArme()                   │
│                                                              │
│  Concrete Strategies                                         │
│  ├─ ComportementHache (Axe Behavior)                        │
│  ├─ ComportementPoignard (Dagger Behavior)                  │
│  └─ ComportementArcEtFleches (Bow & Arrow Behavior)         │
│                                                              │
└─────────────────────────────────────────────────────────────┘
```

### Benefits

✅ **Open/Closed Principle**: Add new weapons without modifying existing character code  
✅ **Runtime Flexibility**: Change combat behavior dynamically  
✅ **Code Reusability**: Weapon behaviors shared across all characters  
✅ **Testability**: Easy to test individual strategies in isolation

---

## 🏗️ Project Architecture

```
strategy-design-pattern/
│
├── src/
│   └── main/
│       └── java/
│           └── org/
│               └── example/
│                   ├── Main.java                    # Application entry point
│                   ├── Personnage.java              # Abstract Character class
│                   ├── ComportementArme.java        # Strategy interface
│                   │
│                   ├── personnages/                 # Character implementations
│                   │   ├── Roi.java                 # King character
│                   │   ├── Reine.java               # Queen character
│                   │   ├── Chevalier.java           # Knight character
│                   │   └── Troll.java               # Troll character
│                   │
│                   └── comportements/               # Strategy implementations
│                       ├── ComportementHache.java   # Axe behavior
│                       ├── ComportementPoignard.java # Dagger behavior
│                       └── ComportementArcEtFleches.java # Bow behavior
│
├── pom.xml                                          # Maven configuration
└── README.md
```

### Core Classes

| Class | Type | Description |
|-------|------|-------------|
| `Personnage` | Abstract Context | Base character class with weapon behavior |
| `ComportementArme` | Strategy Interface | Defines weapon usage contract |
| `Roi`, `Reine`, `Chevalier`, `Troll` | Concrete Contexts | Specific character types |
| `ComportementHache` | Concrete Strategy | Axe combat implementation |
| `ComportementPoignard` | Concrete Strategy | Dagger combat implementation |
| `ComportementArcEtFleches` | Concrete Strategy | Bow and arrow combat implementation |

---

## 🚀 Getting Started

### Prerequisites

Before running this project, ensure you have:

- ☕ **Java Development Kit (JDK) 21+**
- 📦 **Apache Maven 3.6+**
- 💻 **Terminal/Command Prompt**

### Installation

1️⃣ **Clone the repository**
```bash
git clone https://github.com/mabchoor/strategy-design-pattern.git
cd strategy-design-pattern
```

2️⃣ **Compile the project**
```bash
mvn clean compile
```

3️⃣ **Run the application**
```bash
mvn exec:java -Dexec.mainClass="org.example.Main"
```

### Alternative: Using Java directly

```bash
# Compile
javac -d target/classes src/main/java/org/example/*.java

# Run
java -cp target/classes org.example.Main
```

---

## 💡 Usage Examples

### Interactive Session

```
╔════════════════════════════════════════╗
║   RPG Combat System - Strategy Demo   ║
╚════════════════════════════════════════╝

Choisissez un personnage :
1. 👑 Roi (King)
2. 👸 Reine (Queen)
3. ⚔️ Chevalier (Knight)
4. 🧌 Troll

Votre choix : 1

Choisissez une arme :
1. 🪓 Hache (Axe)
2. 🗡️ Poignard (Dagger)
3. 🏹 Arc et flèches (Bow & Arrows)

Votre choix : 3

>>> Le roi : utilise un arc et des flèches !

Que voulez-vous faire ?
1. Changer d'arme
2. Changer de personnage
3. Quitter

Votre choix : 1

Choisissez une arme :
1. 🪓 Hache (Axe)
2. 🗡️ Poignard (Dagger)
3. 🏹 Arc et flèches (Bow & Arrows)

Votre choix : 1

>>> Le roi : utilise une hache !

Que voulez-vous faire ?
1. Changer d'arme
2. Changer de personnage
3. Quitter

Votre choix : 3

✨ Fin du jeu ! Merci d'avoir joué !
```

### Code Example

```java
// Create a character (Context)
Personnage roi = new Roi();

// Set initial weapon strategy
roi.setComportementArme(new ComportementArcEtFleches());
roi.combattre(); // Output: Le roi : utilise un arc et des flèches !

// Change strategy at runtime
roi.setComportementArme(new ComportementHache());
roi.combattre(); // Output: Le roi : utilise une hache !
```

---

## ✨ Key Features

- 🎭 **4 Character Types**: King, Queen, Knight, and Troll
- ⚔️ **3 Weapon Strategies**: Axe, Dagger, and Bow & Arrows
- 🔄 **Dynamic Behavior**: Change weapons at runtime
- 🎮 **Interactive CLI**: User-friendly menu system
- 🧩 **Extensible Design**: Easy to add new characters or weapons
- 📝 **Clean Code**: Follows OOP and SOLID principles
- 🏗️ **Maven Integration**: Standard project structure

---

## 📊 UML Diagram

```
┌─────────────────────────┐
│   <<interface>>         │
│   ComportementArme      │
├─────────────────────────┤
│ + utiliserArme(): void  │
└───────────▲─────────────┘
            │
            │ implements
     ┌──────┴──────┬──────────────┐
     │             │              │
┌────┴─────┐  ┌───┴──────┐  ┌───┴─────────────┐
│Comportement│  │Comportement│  │Comportement     │
│Hache       │  │Poignard   │  │ArcEtFleches     │
└────────────┘  └───────────┘  └─────────────────┘

┌──────────────────────────────┐
│     <<abstract>>             │
│     Personnage               │
├──────────────────────────────┤
│ - comportementArme           │
├──────────────────────────────┤
│ + combattre(): void          │
│ + setComportementArme(): void│
└──────────────▲───────────────┘
               │
       ┌───────┴────────┬──────────┬─────────┐
       │                │          │         │
   ┌───┴───┐      ┌─────┴──┐   ┌──┴────┐  ┌─┴────┐
   │ Roi   │      │ Reine  │   │Chevalier│  │Troll │
   └───────┘      └────────┘   └────────┘  └──────┘
```

---

## 🤝 Contributing

Contributions are what make the open-source community amazing! Any contributions you make are **greatly appreciated**.

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

### Ideas for Contributions

- 🆕 Add new character types (Wizard, Archer, etc.)
- ⚔️ Implement new weapon strategies
- 🎨 Add ASCII art for characters
- 📊 Create comprehensive unit tests
- 🌐 Internationalization support
- 🎮 Add more interactive features

---

## 📄 License

Distributed under the MIT License. See `LICENSE` for more information.

---

## 📧 Contact

**Mabchour Abderrahmane**

[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/m-aberrahmane-dev)
[![GitHub](https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white)](https://github.com/mabchoor)
[![Email](https://img.shields.io/badge/Email-D14836?style=for-the-badge&logo=gmail&logoColor=white)](mailto:m.abderrahmane.dev@gmail.com)

**Project Link**: [https://github.com/mabchoor/strategy-design-pattern](https://github.com/mabchoor/strategy-design-pattern)

---

<div align="center">
  <p><i>⭐ If you found this project helpful, please consider giving it a star!</i></p>
  <p>Made with ❤️ by Abderrahmane Mabchour</p>
</div>
