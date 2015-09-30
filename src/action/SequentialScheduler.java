package action;

public class SequentialScheduler extends Scheduler {

	public void doStep() throws ActionFinishedException
	{
		isReady=false;
		Action nextAction = actionList.get(0);
		nextAction.doStep();
		if(nextAction.isFinished())
			actionList.remove(0);
		throw(new ActionFinishedException());
	}
	
	public boolean isFinished()
	{
		return false;
	}
}
