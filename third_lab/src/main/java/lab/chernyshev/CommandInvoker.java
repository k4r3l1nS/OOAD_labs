package lab.chernyshev;

import java.util.Stack;

public class CommandInvoker {
    private final Stack<Command> comandStack = new Stack<>();

    public void executeCommand(Command command) {
        try {
            command.execute();
            comandStack.push(command);
        } catch (RuntimeException ex) {
            System.out.println(ex.getMessage());
        }

    }

    public void undoCommand() {
        if (!comandStack.isEmpty()) {
            Command command = comandStack.pop();
            command.undo();
        }


    }
}
