# Text_Based_Adventure_game-week-4MCIntern


# Text-Based Adventure Game

## Overview

Welcome to the Text-Based Adventure Game! In this interactive game, you play as a hero on a quest to find the legendary Amulet of Eternity. Your journey will take you through various paths, where you'll make decisions that lead to different outcomes. The game is written in Java and is designed to be simple and easy to understand.

## Features

- **Interactive Storyline**: A compelling story with multiple decision points.
- **Branching Paths**: Different choices lead to different outcomes.
- **Error Handling**: Robust handling of invalid inputs to ensure smooth gameplay.
- **User-Friendly Interface**: Clear instructions and prompts for user input.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) installed on your machine.

### Running the Game

1. **Clone the repository**:
    ```bash
    git clone https://github.com/your-username/text-based-adventure-game.git
    cd text-based-adventure-game
    ```

2. **Compile the Java file**:
    ```bash
    javac AdventureGame.java
    ```

3. **Run the game**:
    ```bash
    java AdventureGame
    ```

## How to Play

1. **Start the Game**: Run the game from the terminal.
2. **Follow the Story**: Read the story prompts and make choices by typing your decisions.
3. **Explore Paths**: Each choice you make will lead you down a different path with unique outcomes.
4. **Reach the Goal**: Navigate through the story to find the Amulet of Eternity.

## Code Structure

- **`AdventureGame.java`**: The main Java file containing the game logic.

### Key Methods

- `main(String[] args)`: The entry point of the game.
- `startGame(Scanner scanner)`: Starts the game and presents the first decision point.
- `hauntedForest(Scanner scanner)`: Handles the storyline for the Haunted Forest path.
- `ancientRuins(Scanner scanner)`: Handles the storyline for the Ancient Ruins path.
- `gatherAllies(Scanner scanner)`: Decision point to gather allies or proceed solo.
- `finalConfrontation(Scanner scanner, boolean hasAllies)`: The final confrontation with the guardian of the Amulet.

### Comments

The code is well-commented to explain complex logic and choices, making it easier for beginners to understand the flow and structure of the game.

## Contributing

If you have suggestions or improvements, feel free to fork the repository and submit a pull request. Contributions are welcome!


## Acknowledgements

- Inspired by classic text-based adventure games.
- Special thanks to everyone who helped test and provide feedback on the game.

## Contact

For any questions or comments, feel free to reach out to machadeepakdas@gmail.com

Enjoy your adventure!
