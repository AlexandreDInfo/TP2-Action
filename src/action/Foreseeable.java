package action;

/**
 * 	@author Delassus
 * 	@author Dyment
 *	This is the foreseeable Action, the base of all Action 
 */
public class Foreseeable extends Action {

// 	Constructor
	
	/**
	 *	@param numberOfStep the number of step
	 *	@throws NumberOfStepNegativeOrNull
	 *	Constructor of foreseeable
	 */
	public Foreseeable(int numberOfStep) throws NumberOfStepNegativeorNullException{
		if(numberOfStep <= 0){
			throw(new NumberOfStepNegativeorNullException());
		}
		this.step = numberOfStep;
		this.ready = true;
		this.finished = false;
	}
	
//	Methods
	
	/**
	 *	Do a step of the Action
	 */
	public void reallyDoOneStep() {
		this.setReady(false);
		this.setStep(getStep() - 1);
	}
}
