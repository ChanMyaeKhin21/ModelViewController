
public class Model {
	
	//All forms of logic

	private String username;
	private String domain = "@hotmail.com";
	
	public String CreateAccount(String first_name, String last_name) {
		this.username = first_name + '.' + last_name + this.domain;
		//Update database with created user name
		
		return this.username;
	}
}
