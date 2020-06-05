import java.util.Scanner;
//All forms of user input and checking

public class Controller {
	
	//User defined method
	private String first_name;
	private String last_name;
	private String final_username;
	private Model m;
	private View v;
	private Scanner s;
	
	
	public Controller() {
		//Set up classes
		m = new Model();
		v = new View();
		
		//Capture external input in private variable
		s = new Scanner(System.in);
		capture_user_info();
		s.close();
	}
	
	private void capture_user_info() {
		System.out.println("Please type in your first name");
		this.first_name = s.nextLine();
		
		System.out.println("Please type in your last name");
		this.last_name = s.nextLine();
		
		
		//Checking (@!?....)
		//....
		//Check complete..
		
		//Update the database

		this.final_username = m.CreateAccount(this.first_name, this.last_name);
		
		//Show the user
		v.ouput_result(this.final_username);
	}
}
