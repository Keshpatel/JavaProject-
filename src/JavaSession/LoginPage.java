package JavaSession;

public class LoginPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LoginPage obj = new LoginPage();
		obj.login("Keshini", "Kavya2015");
		obj.login(9090);
		obj.login("Keshini","PWD!#$","test123@gmmail.com");
		obj.login(454556789, "Keshini");
		
		
	}

//Method overloading --> within the class, when we have different mathods:
	//with the same name, 
	//with different number of parameters 
	//with different sequence. of parameters
	//and this is called overloaded methods.
	//i .e login method, search method, payment method 
	public void login() {
		System.out.println("login simple....");
	}
	public void login(int otp) {
		System.out.println("login with otp....");
	}
	public void login(String username, String passward) {
		System.out.println("login with username pwd and otp...");
	}
	
	public void login(String username, long phone) {
		System.out.println("login with username pwd and otp...");
	}
	public void login(long phone,String username) {
		System.out.println("login with phone and username...");
	}
	public void login(String username, String passward, int opt) {
		System.out.println("login with username pwd and otp...");
	}
	public void login(String username, String passward, String emil) {
		System.out.println("login with username pwd and email...");
	}
	
}
