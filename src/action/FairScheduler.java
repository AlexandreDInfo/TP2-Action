package action;

public class FairScheduler extends Scheduler {
	
	public void reallyDoOneStep()
	{
		isReady=false;
		Action nextAction = actionList.get(0);
		nextAction.reallyDoOneStep();
		if(nextAction.isFinished())
			actionList.remove(0);
	}
	
	public boolean isFinished()
	{
		return false;
	}
}
