package adminlogin;

public class admin {
	
	private int id;
	private String username;
	private String password;
	private String name;
	private String email;
	
	
	
	
	public admin(int id, String username, String password, String name, String email) {
		
		this.id = id;
		this.username = username;
		this.password = password;
		this.name = name;
		this.email = email;
		
		
	}


	public int getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}


	public String getPassword() {
		return password;
	}

	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	


}
