package action;

public abstract class Action {

	public void doStep() throws ActionFinishedException
	{
		if(this.isFinished())
			throw new ActionFinishedException();
		this.reallyDoOneStep();
	}
	
	public abstract void reallyDoOneStep();
	public abstract boolean isFinished();
}
