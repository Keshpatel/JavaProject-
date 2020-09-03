package OOP_Interfaces;

public interface USMedical extends WHO{
	
	// interface have all abstract methods ---100 % abstraction 
	
	int min_fee = 10;
	
	public void ambulanceServices();    // 
	
	public void cardioServices();
	
	public void emergencyServices();
	
	public void orthoServices();
	
	//no method body
	//only method prototype 
	//can not create the object of interface
	//Interface variables are static and final in nature --static var is onlu accesible with class name only 
	/// final variable you can not change the value - its constant  .
	
	
	
	
	//after jdk 1.8:
	//1. you can create a static method with a method body
	
	
	public static void covidTest() {
		System.out.println("US-- Medical ---Covid Test");
	}
	
	//2.you can have a default method :
	default void billing() {
		System.out.println("US----Medical Billing ");
	}

	
	
	
	

}
