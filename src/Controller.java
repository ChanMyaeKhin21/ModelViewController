import java.util.Scanner;
/** 
 * @author Zear
 * 
 * This class intends to mimic the Controller class in the MVC pattern.
 * It's purpose is to delegate control 'flow' to the remainder of the program.
 * The example used is a simple first name and last name to create a non-existent email address.
 */

public class Controller {
	
	private String first_name;
	private String last_name;
	private String final_username;
	private Model m;
	private View v;
	private Scanner s;
	
	public Controller() {
		//Set up objects
		m = new Model();
		v = new View();
		
		//Capture external input in private local variables
		s = new Scanner(System.in);
		_CaptureUserInfo();
		s.close();
	}
	
	private void _CaptureUserInfo() {
		System.out.println("Please type in your first name");
		this.first_name = s.nextLine();
		
		System.out.println("Please type in your last name");
		this.last_name = s.nextLine();
		
		//Add some code procedural code here to perform checks in the input provided

		this.final_username = m.CreateAccount(this.first_name, this.last_name);
		v.ouput_result(this.final_username);
	}
}
