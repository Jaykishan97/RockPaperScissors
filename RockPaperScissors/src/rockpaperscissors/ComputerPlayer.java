package rockpaperscissors;

import java.util.Random;

public class ComputerPlayer implements Player {
    private String name;

    public ComputerPlayer() {
        name = "Computer";
    }

    public String getName() {
        return name;
    }

    public Move getMove() {
        Random random = new Random();
        Move[] moves = Move.values();
        return moves[random.nextInt(moves.length)];
    }
}
