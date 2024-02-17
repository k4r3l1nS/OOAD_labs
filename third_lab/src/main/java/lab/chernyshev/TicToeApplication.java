package lab.chernyshev;

public class TicToeApplication {
    public static void main(String[] args) {
        Game game = new Game(3);
        System.out.println(game);
        CommandInvoker commandInvoker = new CommandInvoker();
        commandInvoker.executeCommand(
                MakeMoveCommand.builder()
                        .game(game)
                        .row(0)
                        .column(0)
                        .build()
        );
        System.out.println(game);
        commandInvoker.executeCommand(
                MakeMoveCommand.builder()
                        .game(game)
                        .row(0)
                        .column(0)
                        .build()
        );
        System.out.println(game);
        commandInvoker.executeCommand(
                MakeMoveCommand.builder()
                        .game(game)
                        .row(1)
                        .column(0)
                        .build()
        );
        System.out.println(game);
        commandInvoker.executeCommand(
                MakeMoveCommand.builder()
                        .game(game)
                        .row(0)
                        .column(1)
                        .build()
        );
        System.out.println(game);
        commandInvoker.executeCommand(
                MakeMoveCommand.builder()
                        .game(game)
                        .row(1)
                        .column(1)
                        .build()
        );
        System.out.println(game);
        commandInvoker.executeCommand(
                MakeMoveCommand.builder()
                        .game(game)
                        .row(0)
                        .column(2)
                        .build()
        );
        System.out.println(game);
        commandInvoker.executeCommand(
                MakeMoveCommand.builder()
                        .game(game)
                        .row(1)
                        .column(2)
                        .build()
        );

        System.out.println("Undo last changing");
        commandInvoker.undoCommand();
        System.out.println(game);
        commandInvoker.executeCommand(
                MakeMoveCommand.builder()
                        .game(game)
                        .row(2)
                        .column(1)
                        .build()
        );
        System.out.println(game);
        commandInvoker.executeCommand(
                MakeMoveCommand.builder()
                        .game(game)
                        .row(1)
                        .column(2)
                        .build()
        );
        System.out.println(game);
        commandInvoker.executeCommand(
                MakeMoveCommand.builder()
                        .game(game)
                        .row(2)
                        .column(2)
                        .build()
        );


    }
}
