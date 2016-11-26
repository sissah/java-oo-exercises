package blogz;

import java.util.regex.Pattern;

public class User extends Entity{
	private String user, pswrd;
	
	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPswrd() {
		return pswrd;
	}

	public void setPswrd(String pswrd) {
		this.pswrd = pswrd;
	}

	public User(String user, String pswrd){
		super();
		this.user = user;
		this.pswrd = pswrd;
		
	}
	
	private static String hashPassword(String password){
		return password;
	}
	
	public String isValidPassword(String P){
		return P;
		
	}
	public boolean isValidUsername(String U){
		boolean b = Pattern.matches("[a-zA-Z][a-zA-Z0-9_-]{4,11}", U);
		return b;
	}
}
