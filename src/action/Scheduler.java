package action;

import java.util.ArrayList;

/**
 * @author Delassus
 * @author Dyment
 * This is abstract Scheduler Action, group of Action
 */
public abstract class Scheduler extends Action {
	
	protected ArrayList<Action> actionList;
	protected boolean isReady;
	
	public abstract void reallyDoOneStep();
	public abstract boolean isFinished();
}
