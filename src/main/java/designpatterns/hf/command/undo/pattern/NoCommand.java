package designpatterns.hf.command.undo.pattern;


public class NoCommand implements Command {
	public void execute() { }
	public void undo() { }
}