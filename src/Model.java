
public class Model {

	/**
	 * @author Zear
	 * 
	 * This class is intended to mimic the Model pattern.
	 * It is supposed to contain code related to some algorithmic logic 
	 * i.e. the 'core' of your program.
	 * 
	 * The example used here is to create a simple non-existent string email address.
	 */

	private String username;
	private String domain = "@brunel.ac.uk";

	public String CreateAccount(String first_name, String last_name) {
		this.username = first_name + '.' + last_name + this.domain;

		//Perform some other logical/algorithmic tasks

		return this.username;
	}
}
