package lab.chernyshev;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Game {
    private final List<List<Character>> board;
    private PlayerSymbol playerSymbol;
    private int counter;
    private final int size;

    private static final CommandInvoker commandInvoker = new CommandInvoker();

    public Game(int size) {
        this.size = size;
        board = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            List<Character> row = new ArrayList<>(Collections.nCopies(size, '-'));
            board.add(row);
        }
        playerSymbol = PlayerSymbol.CROSS;
        counter = 0;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                result.append(board.get(i).get(j)).append(" ");
            }
            result.append("\n");
        }
        return result.toString();
    }

    public void makeMove(int row, int column) {
        if (row > size - 1 || column > size - 1 || row < 0 || column < 0) {
            throw new RuntimeException(LocalDateTime.now() + " | Row or column is out of range");
        }
        if (gameIsOver()) {
            throw new RuntimeException(LocalDateTime.now() + " | Game over\n" + "-----\n" + this + "-----");
        }

        List<Character> currentRow = board.get(row);
        if (currentRow.get(column) != '-') {
            throw new RuntimeException(LocalDateTime.now() + " | This field is already filled. Move was not applied");
        }
        currentRow.set(column, playerSymbol.equals(PlayerSymbol.CROSS) ? 'X' : 'O');
        counter++;
        playerSymbol = playerSymbol.equals(PlayerSymbol.CROSS) ? PlayerSymbol.ZERO : PlayerSymbol.CROSS;
    }


    public void undoMove(int row, int column) {
        List<Character> boardRow = board.get(row);
        boardRow.set(column, '-');
        board.set(row, boardRow);
        playerSymbol = playerSymbol.equals(PlayerSymbol.CROSS) ? PlayerSymbol.ZERO : PlayerSymbol.CROSS;
        counter--;
    }

    public boolean gameIsOver() {

        if (counter < size * 2 - 1) {
            return false;
        }

        for (int i = 0; i < size; i++) {
            if (checkLine(board.get(i), size) || checkLine(getColumn(i), size)) {
                return true;
            }
        }

        if (checkLine(getDiagonal(true), size) || checkLine(getDiagonal(false), size)) {
            return true;
        }

        return counter == size * size;
    }

    private List<Character> getColumn(int columnIndex) {
        List<Character> column = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            column.add(board.get(i).get(columnIndex));
        }
        return column;
    }

    private List<Character> getDiagonal(boolean isMainDiagonal) {
        List<Character> diagonal = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            diagonal.add(isMainDiagonal ? board.get(i).get(i) : board.get(i).get(size - i - 1));
        }
        return diagonal;
    }

    private boolean checkLine(List<Character> line, int size) {
        boolean xWins = true;
        boolean oWins = true;
        for (int i = 0; i < size; i++) {
            if (line.get(i) != 'X' && line.get(i) != 'O') {
                return false;
            } else if (line.get(i) == 'X') {
                oWins = false;
            }
            else if (line.get(i) == 'O') {
                xWins = false;
            }
        }
        return xWins || oWins;
    }

    public enum PlayerSymbol {
        CROSS, ZERO;
    }

    public void inputMove(int row, int column) {
        commandInvoker.executeCommand(
                MakeMoveCommand.builder()
                        .game(this)
                        .row(row)
                        .column(column)
                        .build()
        );
    }

    public void undoMove() {
        commandInvoker.undoCommand();
    }
}
