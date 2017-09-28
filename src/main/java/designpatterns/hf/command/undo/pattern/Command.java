package designpatterns.hf.command.undo.pattern;

public interface Command {
	public void execute();
	public void undo();
}
