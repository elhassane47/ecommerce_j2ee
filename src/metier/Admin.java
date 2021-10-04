package metier;

public class Admin {
	private static int id ;
	private String username ;
	private String password ;
	public static int getId() {
		return id;
	}
	public static void setId(int id) {
		Admin.id = id;
	}
	public String getUsername() {
		return username;
	}
	public Admin() {
		super();
	}
	public Admin(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
