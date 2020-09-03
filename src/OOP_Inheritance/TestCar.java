package OOP_Inheritance;

public class TestCar {
	
	public static void main(String[] args) {
		
	
		BMW b = new BMW();
		b.start(); //overridden method
		b.stop(); // inherited method 
		b.refuel(); // inherited method 
		b.autoParking();  //  child class method 
		b.engine();
		BMW.display();
	
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		Car.display();
	
		
		//Top casting :
		Car c1 = new BMW();   //child class object can be 
							  //refereed by parent class reference variable 
		
		c1.start();  //overridden method 
		c1.stop();  // Inherited 
		c1. refuel(); // inherited 
		c1.engine(); // Inherited 
		
		
		Vehicle v1  =  new BMW();
		v1.engine();
		
		
		
		//Down casting : not allowed 
		//BMW b1 = (BMW) new Car();  //  java.lang.ClassCastException:
	    //run time Exception
		//b1.start();
		// BMW b2 = (BMW) new Vehicle();   / not allowed 
		
		
		
	}

}
