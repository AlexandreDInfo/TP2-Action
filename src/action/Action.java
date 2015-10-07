package action;

public abstract class Action {
	
	protected int step;
	protected boolean ready;
	protected boolean finished;

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
// 		Methods
		
		public void doStep() throws ActionFinishedException
		{
			if(this.isFinished())
				throw new ActionFinishedException();
			this.reallyDoOneStep();
		}
		
		protected abstract void reallyDoOneStep();
}
