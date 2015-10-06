package action;

public class NumberOfStepNegativeorNullException extends Exception {
	
	/**
	 * the serialVersionUID
	 */
	private static final long serialVersionUID = 2L;

	public NumberOfStepNegativeorNullException(){
		
		System.out.println("The action need to have a number of step > 0.");
		
	}
	
}
