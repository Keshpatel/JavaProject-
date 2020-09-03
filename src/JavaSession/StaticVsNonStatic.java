package JavaSession;

public class StaticVsNonStatic {

	//class variable
	String name;   
	static int age;
	
	
	public static void main(String[] args) {
			
		//how to access non - static variable s and methods:
		//create the object the class.
		StaticVsNonStatic obj = new StaticVsNonStatic();
		StaticVsNonStatic obj1 = new StaticVsNonStatic();
		StaticVsNonStatic obj2 = new StaticVsNonStatic();
		StaticVsNonStatic obj3 = new StaticVsNonStatic();
		StaticVsNonStatic obj4 = new StaticVsNonStatic();
		
		obj.name = "Keshini";
		
		System.out.println(obj.name);
		obj.getName();
		
		
		//How to call static variables and method :
		//1. direct calling : no need to create the object
		age= 25;
		System.out.println(age);
		obj.name = "Naveen";
		getValue();
		
		// 2. call by class name:
		System.out.println(StaticVsNonStatic.age);
		StaticVsNonStatic.getValue();
		
		//can we use object to call the static stuff?
		
	}
	
	
	public static void getValue() {
		System.out.println("get Value...");
	}
	
	public void getName() {
		System.out.println("get name....");
	}
	
	
}
