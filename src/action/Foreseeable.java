package action;

/**
 * 	@author Delassus
 * 	@author Dyment
 *	This is the foreseeable Action, the base of all Action 
 */
public class Foreseeable implements Action {

	private int step;
	private boolean finished;
	private boolean ready;
	
// 	Constructor
	
	/**
	 *	@param numberOfStep the number of step
	 *	@throws NumberOfStepNegativeOrNull
	 *	Constructor of foreseeable
	 */
	public Foreseeable(int numberOfStep) throws NumberOfStepNegativeorNull{
		if(numberOfStep <= 0){
			throw(new NumberOfStepNegativeorNull());
		}
		this.step = numberOfStep;
		this.ready = true;
		this.finished = false;
	}
	
// Getter / Setter
	
	/**
	 *	Getter of step
	 *	@return step number of step
	 */
	public int getStep() {
		return step;
	}
	
	/**
	 *	Setter of step
	 *	@param step number of step
	 */
	public void setStep(int step) {
		this.step = step;
	}
	
	/**
	 *	Getter of ready
	 *	@return ready
	 */
	public boolean isReady()
	{
		return ready;
	}
	
	/**
	 *	Setter of ready
	 *	@param ready
	 */
	public void setReady(boolean ready) {
		this.ready = ready;
	}
	
	/**
	 *	Getter of finished
	 *	@return finished
	 */
	public boolean isFinished()
	{
		return finished;
	}
	
	/**
	 *	Setter of finished
	 *	@param finished
	 */
	public void setFinished(boolean finished) {
		this.finished = finished;
	}
	
//	Methods
	
	/**
	 *	Do a step of the Action
	 *	@throws ActionFinishedException when the Foreseeable is finished
	 */
	public void doStep() throws ActionFinishedException {
		setStep(getStep() - 1);
		if(this.getStep() <= 0)
			throw(new ActionFinishedException());
	}
}
