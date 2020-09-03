package OOP_Inheritance;


public class BMW extends Car {
	
	//Method Overriding --When we have a method in a parent class 
	//and the same method is in the child class with : 
	//same name, same number of parameter and same type of parameter .
	//called overridden method .
	
	@Override
	public void start() {
			System.out.println("BMW --- strart");
	}
	
	public void autoParking() {
			System.out.println("BMW --- autoparking");
	}
	
	public static void display() {
		System.out.println("car --- dispaly");
	}
	
}
