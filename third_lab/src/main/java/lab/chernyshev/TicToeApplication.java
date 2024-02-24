package lab.chernyshev;

public class TicToeApplication {
    public static void main(String[] args) {

        Game game = new Game(3);
        System.out.println(game);

        game.inputMove(0, 0);
        System.out.println(game);

        game.inputMove(0, 0);
        System.out.println(game);

        game.inputMove(1, 0);
        System.out.println(game);

        game.inputMove(0, 1);
        System.out.println(game);

        game.inputMove(1, 1);
        System.out.println(game);

        game.inputMove(0, 2);
        System.out.println(game);

        game.inputMove(1, 2);

        System.out.println("\n--- UNDO LAST MOVE ---\n");
        game.undoMove();
        System.out.println(game);

        game.inputMove(2, 1);
        System.out.println(game);

        game.inputMove(1, 2);
        System.out.println(game);

        game.inputMove(2, 2);
    }
}
