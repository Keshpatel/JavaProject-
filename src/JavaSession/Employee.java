package JavaSession;

import java.util.ArrayList;

public class Employee {
	//Class variables 
	String name;
	int age;
	int Empid;
	double salary;
	boolean isPermenent;
	String role;
	String CompanyName;
	ArrayList<String> devicelist;
	
	
	//you can create the constructor with all 
	//class variables or with partial class variables
	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Employee(String name, int age, int Empid) {
		this.name = name;
		this.age = age;
		this.Empid = Empid;
	}
	public Employee(String name, double salary, String role) {
		this.name = name;
		this.salary = salary;
		this.role = role;
	}
	
	public Employee(String name, int age, int Empid, double salary, 
			boolean isPermenent, String role,String CompanyName, ArrayList<String> devlist) {
		this.name = name;
		this.age = age;
		this.Empid = Empid;
		this.salary = salary;
		this.isPermenent = isPermenent;
		this.role = role;
		this.CompanyName = CompanyName;
		this.devicelist = devlist;
	
	}
	
	
	public Employee(String name, int Empid, ArrayList<String> devicelist) {
		
		this.name = name;
		this.Empid = Empid;
		this.devicelist = devicelist;
	}
	//Constructor can be overloaded
	public Employee() { //0 parameter -----Default constructor 
		System.out.println("Default Const...");
	}
	public Employee(int i ) { //1 parameter -----Default constructor 
		System.out.println("1-Parameter  Const..." +i);
		
	}
	public Employee(int i , String s) { //2 parameter -----Default constructor 
		System.out.println("2-Parameter  Const..." + i + s);
		
	}
	public static void main(String[] args) {
//		Employee e1 = new Employee(10, " test");
		ArrayList<String> devlist = new ArrayList<String>();
		devlist.add("Macbook pro 16 inches");
		devlist.add("Apple i phone x ");
		devlist.add("Android Samsung 10");
		
		Employee e1 = new Employee("\nTom", 25, 678);
		System.out.println(e1.name);
		System.out.println(e1.age);
		System.out.println(e1.Empid);
		
		Employee e2 = new Employee("Keshini", 24, 102, 34.44, true, "SDET1", "IBM", devlist);
		System.out.println("\n" + e2.CompanyName +" "+ e2.age +" "+ e2.salary);
		System.out.println(e2.devicelist);
		System.out.println(e2.devicelist.get(0));
	
	
	Employee e3 = new Employee("Priyanka", 103, devlist);
	System.out.println();
	System.out.println(e3.name);
	System.out.println(e3.Empid);
	System.out.println(e3.devicelist);
	System.out.println(e3.devicelist.size());
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
