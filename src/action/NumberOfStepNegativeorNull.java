package action;

public class NumberOfStepNegativeorNull extends Exception {
	
	/**
	 * the serialVersionUID
	 */
	private static final long serialVersionUID = 2L;

	public NumberOfStepNegativeorNull(){
		
		System.out.println("The action need to have a number of step > 0.");
		
	}
	
}
