package OOP_AbstractConcept;

public class LoginPage extends Page{

	public LoginPage() {
		System.out.println("Login Page Constuctor ...");
	}
	
	@Override
	public void header() {
		System.out.println(" LP ---- Header");
		
	}

	@Override
	public void title() {
		System.out.println(" LP ---- title");
		
	}
	//Method overloading 
	public void doLogin() {
		System.out.println("Lp-- do Login");
	}
	
	public void doLogin(String Username, String PWD) {
		System.out.println("Lp-- do Login with " + Username + " "  + PWD);
	}
	

}
