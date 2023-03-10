package rockpaperscissors;

import java.util.Scanner;

public class HumanPlayer implements Player {
    private String name;
    private Scanner scanner;

    public HumanPlayer() {
        scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = scanner.nextLine();
    }

    public String getName() {
        return name;
    }

    public Move getMove() {
        System.out.print("Enter your move (rock, paper, or scissors): ");
        String input = scanner.nextLine();
        switch (input.toLowerCase()) {
            case "rock":
                return Move.ROCK;
            case "paper":
                return Move.PAPER;
            case "scissors":
                return Move.SCISSORS;
            default:
                System.out.println("Invalid move. Please try again.");
                return getMove();
        }
    }
}
