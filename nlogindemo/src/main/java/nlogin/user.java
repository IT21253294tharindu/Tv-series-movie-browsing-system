package nlogin;

public class user {
	private int id;
	private String username;
	private String password;
	private String name;
	private String email;
	private String address;
	private String phone;
	
	public user(int id, String username, String password, String name,String phone, String address,String emailu) {
		
		this.id = id;
		this.username = username;
		this.password = password;
		this.name = name;
		this.email = emailu;
		this.address = address;
		this.phone=phone;
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


	public String getAddress() {
		return address;
	}
	public String getphone() {
		return phone;
	}


	
	
	
	

}
