package OOP_AbstractConcept;

public abstract class Page {
	
	//No method body :  abstract method
	//can not create object of abstract class 
	/////// we can have constructor of abstract class : 
	//            --It will be called when you create the 
	//            --object of child class
	
	public Page() {
		System.out.println("Page class -- Constructor ");
	}
	abstract public void header();
	abstract public void title();
	
	public static void logo() {
		System.out.println("Page---Logo");
	}

			
	public void display() {
		System.out.println("Page-- Display");
	}

	
	//0 % abstraction : No abstract method in abstract class
	//100% abstraction : yes (all the methods are abstract
	// 0- 100% Partial abstraction . Some methods are abstract and some are non- abstract




}
