package action;

public interface Action {

	public void doStep() throws ActionFinishedException;
	public boolean isFinished();
}
