package designpatterns.hf.behavioural.command.undo.pattern;

public interface Command {
	public void execute();
	public void undo();
}
