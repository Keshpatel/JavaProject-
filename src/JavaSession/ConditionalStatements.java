package JavaSession;

public class ConditionalStatements {

	public static void main(String[] args) {
		int a = 30;
		int b = 30;
		
		if (b>a){ // if condition is representing boolean always 
			System.out.println("B is greater then a");
		}
		else{
	    System.out.println(" A is greter then or equal to b ");
		}

		if(a == 30)
		{ 
			System.out.println("a is eq 30");
		}
		if(true) 
		{
			System.out.println("hi");
		}
		else {
			System.out.println("Bye"); //Dead code 
		}
		
		int num = 29;
		if(num < 100 && num > 30) {
			System.out.println("Pass");
			if (num >= 80) {
				System.out.println("Grade A");
			}
			if(num >= 50 && num < 80) {
				System.out.println("Grade B");
		     }
		}
		else {
			System.out.println("Fail");
		}
		
		
		int total = 100;
		if(total >=100) {
			System.out.println("Hii");
			total = total  + 300;
		}
		if (total >= 200) {
			System.out.println("hello");
			total = total - 300;
		}
		if (total >= 300) {
			System.out.println("bye");
		}
		
		int number = 20;
		if (number == 10) {
			
			if(number < 15) {
				System.out.println("\nHello number");
			}
			if(number < 12) {
				System.out.println("Hi number");
			}
			else {
				System.out.println("Bye number");
			}
		}
		else {
			System.out.println("bye!~~~~~~");
		}
		
		
		
		///if elseif elseif
		
		String name = "tom";
		int marks = -1;
		
		if (name.equals("Nakul")){
			marks = 90;
		}
		else if(name.equals("Vibha")) {
			marks = 95;
		}
		else if(name.equals("Simran")) {
			marks = 100;
		}
		else if(name.equals("Naveen")) {
			marks = 5;
		}
		else {
			System.out.println("\nStudent name : "+ name + " is not found");
		}
		System.out.println("\n" + name + ":" + marks);
		
		
		//if if if if 
//		if(name.equals("Nakul")) {//primitive datatypes compare with == , but for string .equals().
//			System.out.println("");	
//			marks = 90;
//		}
//		if (name.equals("Vibha")){
//			marks = 95;
//		}
//		if (name.equals("simran")){
//			marks = 10;
//		}
//		if (name.equals("Naveen")){
//			marks = 1;
//		}
//		System.out.println(name + ":" + marks);
//		
		
		String browser = "Opera";
		
		if(browser.equals("Chrome")) {
			System.out.println("\nLaunching Chrome ...");
		}
		else if(browser.equals("ff")){
			System.out.println("\nLaunching ff ...");
		}
		else if(browser.equals("ie")) {
			System.out.println("\nLaunching ie ...");
		}
		else {
			System.out.println("\nBrowser is not found , Please pass correct browser name");
		}
		
		 ///WAP to get the higest number out of three diff number 
		
		int x= 500;
		int y = 700;
		int z= 300;
		
		// && ==> shot circuit operator
		if (x>y && x>z) {
			System.out.println("\nx is the higest");
		}
		else if(y>z) {
			System.out.println("\ny is the higest");
		}
		else {
			System.out.println("\nz is the higest");
		}
		
		
		int p = 10;
		int q = 20;
		int r = 30;
		
		//  ||  ==> OR Operator 
		

		
		
	}
}
			
			
			
			
			