package action;

public class FairScheduler extends Scheduler {
	
	public void doStep() throws ActionFinishedException
	{
		isReady=false;
		Action nextAction = actionList.get(0);
		nextAction.doStep();
		if(nextAction.isFinished())
			actionList.remove(0);
	}
	
	public boolean isFinished()
	{
		return false;
	}
}
