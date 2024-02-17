package lab.chernyshev;

import lombok.AllArgsConstructor;
import lombok.Builder;

@AllArgsConstructor
@Builder
public class MakeMoveCommand implements Command{
    private Game game;
    private int row;
    private int column;
    @Override
    public void execute() {
        game.makeMove(row,column);
    }

    @Override
    public void undo() {
        game.undoMove(row,column);
    }
}
