package JavaSession;

public class LoginFeature {
	
	private String Username;
	private String Passward;
	

	
	public LoginFeature(String username, String passward) {
		this.Username = username;
		this.Passward = passward;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getPassward() {
		return Passward;
	}
	public void setPassward(String passward) {
		Passward = passward;
	}

}
