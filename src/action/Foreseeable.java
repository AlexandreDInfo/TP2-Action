package action;

public class Foreseeable implements Action {

	private int step;
	
	public boolean isReady()
	{
		return false;
		
	}

	public boolean isFinished()
	{
		return true;
	}
	
	@Override
	public void doStep() throws ActionFinishedException {
		step--;
		throw(new ActionFinishedException());
	}
	
	
	
}
