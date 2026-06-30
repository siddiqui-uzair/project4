# Mystery Bag Game

A probability-based **Java console game** demonstrating polymorphism, inheritance, and game logic.

## Features

✅ Three difficulty levels (Easy, Medium, Hard)

✅ Multiple item types with different values

✅ Polymorphic item system

✅ Strategic decision-making gameplay

✅ Score tracking

✅ Replay functionality

## Technologies

- Java
- Object-Oriented Programming (Polymorphism, Inheritance)
- ArrayList Collections
- Game Logic & Probability

## Quick Start

```bash
javac -d bin src/*.java
java -cp bin MainClass
```

## Project Structure

src/

├── MainClass.java              # Game controller

├── BagItemSuperclass.java      # Base item class

├── CoinItem.java               # Coin item

├── DiceItem.java               # Dice item

└── BlankItem.java              # Safe item

## Gameplay

- Draw items from mystery bag
- Each draw adds value to total
- Exceed bust limit = Game Over
- Clear all items = Win
- Strategic risk/reward decisions

## Skills Demonstrated

- Polymorphism & inheritance
- ArrayList collection management
- Game state management
- Probability-based logic


## Difficulty Levels

- **Easy:** Higher bust limit, fewer risky items
- **Medium:** Balanced gameplay
- **Hard:** Lower bust limit, more challenging

Academic Project
This project was developed as part of my BSc Computer Science (Artificial Intelligence) coursework at Heriot-Watt University Dubai. It is shared for portfolio and educational purposes.
