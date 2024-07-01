import java.util.Scanner;

public class AdventureGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Adventure Game!");
        System.out.println("You are a hero on a quest to find the lost Amulet of Eternity.");
        startGame(scanner);
        scanner.close();
    }

    // The starting point of the game where the player chooses the first path
    public static void startGame(Scanner scanner) {
        System.out.println("Legend has it that the Amulet of Eternity grants its bearer unmatched power and wisdom. Your journey begins.");
        System.out.println("You have two paths to choose from: the Haunted Forest or the Ancient Ruins. (forest/ruins)");
        String choice = scanner.nextLine().toLowerCase();
        switch (choice) {
            case "forest":
                hauntedForest(scanner);
                break;
            case "ruins":
                ancientRuins(scanner);
                break;
            default:
                System.out.println("Invalid choice. Please enter 'forest' or 'ruins'.");
                startGame(scanner); // Recursively call startGame to prompt for valid input
                break;
        }
    }

    // Path leading to the Haunted Forest
    public static void hauntedForest(Scanner scanner) {
        System.out.println("You enter the Haunted Forest, known for its eerie silence and mysterious figures.");
        System.out.println("You encounter a cloaked figure who offers to share knowledge about the Amulet. Do you talk to him or fight him? (talk/fight)");
        String choice = scanner.nextLine().toLowerCase();
        switch (choice) {
            case "talk":
                // Choosing to talk provides a clue without injury
                System.out.println("The figure reveals a hidden clue: 'Seek the ancient tree that whispers secrets.' You proceed further into the forest.");
                gatherAllies(scanner);
                break;
            case "fight":
                // Choosing to fight results in injury but still provides a clue
                System.out.println("You defeat the figure but sustain injuries. On his body, you find a clue: 'Seek the ancient tree that whispers secrets.'");
                gatherAllies(scanner);
                break;
            default:
                System.out.println("Invalid choice. Please enter 'talk' or 'fight'.");
                hauntedForest(scanner); // Recursively call hauntedForest to prompt for valid input
                break;
        }
    }

    // Path leading to the Ancient Ruins
    public static void ancientRuins(Scanner scanner) {
        System.out.println("You arrive at the Ancient Ruins, a place of forgotten knowledge and hidden dangers.");
        System.out.println("To enter, you must solve a puzzle inscribed on a stone tablet. The puzzle reads: 'What walks on four legs in the morning, two legs at noon, and three legs in the evening?' (answer)");
        String choice = scanner.nextLine().toLowerCase();
        if (choice.equals("human")) {
            // Correct puzzle answer allows entry into the ruins
            System.out.println("Correct! You solve the puzzle and enter the ruins. Inside, you encounter a guardian who blocks your path.");
            System.out.println("Do you persuade the guardian or battle him? (persuade/battle)");
            choice = scanner.nextLine().toLowerCase();
            switch (choice) {
                case "persuade":
                    // Persuading the guardian provides a clue without a fight
                    System.out.println("Using your wit, you convince the guardian to let you pass. He reveals a clue: 'The Amulet lies where the sun meets the earth.'");
                    gatherAllies(scanner);
                    break;
                case "battle":
                    // Battling the guardian provides a clue but involves combat
                    System.out.println("You engage in a fierce battle and defeat the guardian. On his person, you find a clue: 'The Amulet lies where the sun meets the earth.'");
                    gatherAllies(scanner);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 'persuade' or 'battle'.");
                    ancientRuins(scanner); // Recursively call ancientRuins to prompt for valid input
                    break;
            }
        } else {
            System.out.println("Incorrect. Think again.");
            ancientRuins(scanner); // Recursively call ancientRuins to prompt for valid input
        }
    }

    // Decision point to gather allies or go solo
    public static void gatherAllies(Scanner scanner) {
        System.out.println("You can either gather allies or go solo. What do you choose? (allies/solo)");
        String choice = scanner.nextLine().toLowerCase();
        switch (choice) {
            case "allies":
                // Choosing to gather allies provides companions with special abilities
                System.out.println("You gather a wise wizard and a strong warrior to join you on your quest.");
                finalConfrontation(scanner, true);
                break;
            case "solo":
                // Choosing to go solo increases the player's experience points
                System.out.println("You decide to face the challenges alone, honing your skills and gaining more experience.");
                finalConfrontation(scanner, false);
                break;
            default:
                System.out.println("Invalid choice. Please enter 'allies' or 'solo'.");
                gatherAllies(scanner); // Recursively call gatherAllies to prompt for valid input
                break;
        }
    }

    // Final confrontation with the guardian of the Amulet
    public static void finalConfrontation(Scanner scanner, boolean hasAllies) {
        System.out.println("You reach the location where the Amulet of Eternity is said to be hidden. A powerful guardian stands in your way.");
        System.out.println("How will you confront the guardian? (wisdom/strength/magic)");
        String choice = scanner.nextLine().toLowerCase();
        switch (choice) {
            case "wisdom":
                // Use wisdom to outsmart the guardian
                if (hasAllies) {
                    System.out.println("With the wizard's guidance, you outsmart the guardian and retrieve the Amulet of Eternity. You win!");
                } else {
                    System.out.println("Using your accumulated wisdom, you outsmart the guardian and retrieve the Amulet of Eternity. You win!");
                }
                break;
            case "strength":
                // Use strength to overpower the guardian
                if (hasAllies) {
                    System.out.println("With the warrior's strength, you overpower the guardian and retrieve the Amulet of Eternity. You win!");
                } else {
                    System.out.println("Using your enhanced strength, you overpower the guardian and retrieve the Amulet of Eternity. You win!");
                }
                break;
            case "magic":
                // Use magic to defeat the guardian
                if (hasAllies) {
                    System.out.println("Combining your magic with the wizard's, you cast a powerful spell and defeat the guardian, retrieving the Amulet of Eternity. You win!");
                } else {
                    System.out.println("Using your powerful magic, you cast a spell and defeat the guardian, retrieving the Amulet of Eternity. You win!");
                }
                break;
            default:
                System.out.println("Invalid choice. Please enter 'wisdom', 'strength', or 'magic'.");
                finalConfrontation(scanner, hasAllies); // Recursively call finalConfrontation to prompt for valid input
                break;
        }
    }
}
