package chap06_Command;

public class NoCommand implements Command {
    @Override
    public void execute() { }

    public void undo() { }
}
