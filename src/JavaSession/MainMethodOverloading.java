package JavaSession;

public class MainMethodOverloading {

	public static void main(String[] args) {
		
		System.out.println("Main Method ....1");
	
		
	main(20);
	main(20, 30);
	}

	

	public static void main(int i) {
		System.out.println("Main Method of int " + i);
	}
	public static void main(int i, int j) {
		System.out.println("Main method for sum, " + (i+j));
	}
	
	public static void main(String str) {
	System.out.println("Main method  ...."+ str);
	}
	
	
	
	
	
	
	
	
}
