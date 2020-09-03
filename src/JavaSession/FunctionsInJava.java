package JavaSession;

import java.util.ArrayList;

public class FunctionsInJava {
	
	//Can not create a functions/ Method inside  a function/Method.
	// Functions are always independent or parallel to each other
	
	
	public static void main(String[] args) {
		
		//Create the object of class:
		FunctionsInJava obj = new FunctionsInJava();
		//obj is name is object .///It is not object --It is name of object
		//new FunctionsInJava() is Object.
		obj.test();
		obj.getName();
		int k = obj.add();
		System.out.println(k);
	    String s = obj.getTrainerName();
		System.out.println("Trainer name is :" +s);
		System.out.println(obj.IsPermenent());
		int s1 = obj.sum(10,20);
		System.out.println(s1);
		int s2 = obj.sum(40, 50);
		System.out.println(s2);
		double dr = obj.multiply(2.3 , 3.4);
		System.out.println(dr);
		System.out.println(obj.getStudentMarks("Naveen"));
		System.out.println(obj.getStudentMarks("Tom"));
		obj.launchDriver("ff");
		
		System.out.println(obj.getStudentsNames("first")[0]);
		
		String studentArray[] = obj.getStudentsNames("first");
		for(String s3: studentArray)
		{
			System.out.println(s3);
		}
		ArrayList<String> walMartProdList = obj.getProductList("walmart");
		System.out.println("\nTotal Products in walmart store: "+ walMartProdList.size());
		
//		for (String prod : walMartProdList) {
//			System.out.println(prod);
//		}
		
		//walMartProdList.forEach(ele -> System.out.println(ele)); //lambda (new concept to print array list
		walMartProdList.stream().forEach(System.out::println);//method reference in JDK 1.8
		
		System.out.println(obj.isUSCitizen("Keshini"));		
		
	}
	
	
	
	
	// 1. No Input and No return :
	//void -- method can not return anythong	
	public void test() {		System.out.println("Test Method got executed... ");   }
	public void getName() {  System.out.println("Get name method executed now...");   }
	//2.no input but some return:
	public int add() 
	{   
	int a = 10 ;  
	int b = 20 ; 
	int c= a+b; 
	return c;  
	
	}
	public String getTrainerName() 
	{   
		String name= "Keshini"; 
		return name;   
	}
	public boolean IsPermenent() 
	{   
		boolean b = true;  
		return b;  
	}
	//3. Some input but some return:
	public int sum(int x, int y) 
	{ 
	System.out.println("Sum Method....");  
	int s = x+y; 
	return s;  
	}
	// return type Double
	/**
	 * This is use to multiply 2 number
	 * @param g
	 * @param h
	 * @return
	 */
		public double multiply(double g, double h) {
			
			System.out.println("Multiply method");
			double mul = g * h;
			return mul;
		}
	
		public int getStudentMarks(String name) {
			
			System.out.println("Get Student Marks Method .....");
			int marks = -1; if (name.equalsIgnoreCase("Naveen")) {  marks = 10;	}
			else if(name.equalsIgnoreCase("Priya")) {				marks= 70;			}
			else if(name.equalsIgnoreCase("ilias")) {				marks = 90;			}
			else {				System.out.println("Not available: " + name);			}			return marks;		}

	//WAM where you have to send a browser name and launch browser accordigly
		
		public void launchDriver(String browserName) {
			
			System.out.println("Launching Browser......");
			
			if(browserName.equalsIgnoreCase("chrome")) {
				
				System.out.println("launch google Chrome");
			}
			if(browserName.equalsIgnoreCase("ie")) {
				
				System.out.println("launch  ie");
			}
			if(browserName.equalsIgnoreCase("safari")) {
	
				System.out.println("launch safari");
			}
			if(browserName.equalsIgnoreCase("ff")) {
	
				System.out.println("launch ff");
			}
			else {
				System.out.println("Browser is not found " + browserName + "We do not support ");
			}
			
		}
	
		
//WAP---> which will take className(String ) --- return the list of the student (Static Array)
		
		public String[] getStudentsNames(String className) {
			String studentNames[] = new String[3];
 			if (className.equalsIgnoreCase("first")) {
				studentNames[0] = "Tom";
				studentNames[1] = "Rick";
				studentNames[2] = "Moly";
			}
 			else if(className.equalsIgnoreCase("Second")) {
 				studentNames[0] = "Ishan";
				studentNames[1] = "Shiva";
				studentNames[2] = "Tena";
 			}
			return studentNames;
		}
		
		
//WAM -- which will take e-comm site name and then return list of all products availbale on that page.
		
		public ArrayList<String> getProductList(String siteName) {
			
			System.out.println("Get the list of product from "+ siteName);
			
			ArrayList<String> productList = new ArrayList<String>();
			
			if(siteName.equalsIgnoreCase("flipcart")){
				productList.add("Apple Macbook Pro");
				productList.add("apple iphonex");
				productList.add("Nike Shoes");
			}
			else if(siteName.equalsIgnoreCase("amazon")){
				productList.add("Apple Macbook Pro");
				productList.add("apple iphonex");
				productList.add("Nike Shoes");
			}
			else if(siteName.equalsIgnoreCase("walmart")){
				productList.add("Apple Macbook Pro");
				productList.add("apple iphonex");
				productList.add("Nike Tshirts");
			}
			
			else {
				System.out.println("Product list not available");
			}
		return productList;
		
		}
			
			
			
//WAP which will decide that person is US citizen or not...
		public boolean isUSCitizen(String personName) {
			System.out.println("  Status for : " + personName);
			boolean status = false;
			if(personName.contentEquals("Nimpa")) {
				return status;
			}
			else if(personName.equalsIgnoreCase("Shweta")) {
				status = true;
				return status;
			}
			else if(personName.equalsIgnoreCase("naveen")) {
				return status;
			}
			else {
				System.out.println(personName +" is not found....");
				return status;
			}
			//return status;
		}
			
				
			
		
}
























