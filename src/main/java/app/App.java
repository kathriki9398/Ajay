package app;

import java.util.ResourceBundle;

public class App {

	public int userLogin(String in_user,String inpwd) {
		
		ResourceBundle rb = ResourceBundle.getBundle("config");
		
		String username= rb.getString("username");
		String password = rb.getString("password");
		
		if(in_user.equals(username) && inpwd.equals(password)) {
			return 1;
			
		}else {
			return 0;
		}
	}
	
	
}
