package action;

import java.util.ArrayList;

/**
 * @author Delassus
 * @author Dyment
 * This is abstract Scheduler Action, group of Action
 */
public abstract class Scheduler implements Action {
	
	protected ArrayList<Action> actionList;
	protected boolean isReady;
	
	public abstract void doStep() throws ActionFinishedException;
	public abstract boolean isFinished();
}
