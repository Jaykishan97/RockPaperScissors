package rockpaperscissors;

public class Game {
    private Player player1;
    private Player player2;

    public Game() {
        player1 = new HumanPlayer();
        player2 = new ComputerPlayer();
    }

    public void play() {
        System.out.println(player1.getName() + " vs. " + player2.getName() + "!");

        Move p1move = player1.getMove();
        Move p2move = player2.getMove();

        System.out.println(player1.getName() + " played " + p1move + ".");
        System.out.println(player2.getName() + " played " + p2move + ".");

        int result = p1move.compareTo(p2move);
        if (result == 0) {
            System.out.println("It's a tie!");
        } else if (result < 0) {
            System.out.println(player1.getName() + " wins!");
        } else {
            System.out.println(player2.getName() + " wins!");
        }
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.play();
    }
}
