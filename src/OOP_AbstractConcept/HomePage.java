package OOP_AbstractConcept;

public class HomePage extends Page{

	@Override
	public void header() {
	 System.out.println("Hpme Page --- Header");
		
	}

	@Override
	public void title() {
		 System.out.println("Hpme Page --- title");
		
	}

	public void showAccountDetails() {
		System.out.println("HP --- showAcountDetail");
	}
	
	@Override
	public void display() {
		System.out.println("Home Page-- Display with welcome banner");
	}

}
