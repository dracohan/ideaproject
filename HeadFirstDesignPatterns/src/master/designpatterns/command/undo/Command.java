package master.designpatterns.command.undo;

public interface Command {
	public void execute();
	public void undo();
}
