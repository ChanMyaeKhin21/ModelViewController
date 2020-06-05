
public class View {
	/**
	 * @author Zear
	 * 
	 * This class is intended to mimic the View pattern.
	 * It is supposed to contain all code related to 'showing' the user
	 * the result of a process/output of the system. All design related facets such as
	 * colour, look, style, animation, errors etc... is to be written here.
	 * 
	 * The example here simply outputs the email address to the console.
	 */

	public void ouput_result(String input) {
		//Update an animation
		//Show notification
		//Show errors
		//or some other type of visual process
	
		System.out.println("Your account is: " + input);
		System.out.println("Thank you, goodbye!");
	}

}
