package OOP_AbstractConcept;

public class IciciBankTest {

	public static void main(String[] args) {
	
			LoginPage lp = new LoginPage();
			lp.header();
			lp.title();
			lp.display();
			lp.doLogin("admin", "Admin123");
			
			
			///top casting : child class object can be refereed by parent class refe var.
			Page p = new LoginPage();
			
			p.header();
			p.title();
			p.display();
		
			
			
			
			
	}

}
