package action;

public class ActionFinishedException extends Exception {

	/**
	 * the serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	public ActionFinishedException()
	{
		System.out.println("The action is finished.");
	}
}
