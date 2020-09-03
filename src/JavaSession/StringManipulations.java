package JavaSession;

public class StringManipulations {

	public static void main(String[] args) {
		
		String str = "This is my java code and i am so happy";
		
		System.out.println(str.length());
		
		int l = str.length();
		
		System.out.println("The length of string is  : " + l );
		System.out.println("The lowest ---> " + 0);
		System.out.println("The higest ----> " + (l-1));
		
		System.out.println(str.charAt(3));

		System.out.println(str.charAt(0));
		
		//System.out.println(str.charAt(38)); //java.lang.StringIndexOutOfBoundsException: String index out of range: 38
		System.out.println(str.charAt(l-1));
		System.out.println(str.charAt(l-4));
		
		//System.out.println((str.charAt(-1))); java.lang.StringIndexOutOfBoundsException: String index out of range: -1
		
		
		System.out.println(str.indexOf('h')); // first occurrence of h
		
		
		System.out.println("\nFist occurence of s ----> ");
		System.out.println(str.indexOf('s'));//1st occurrence of s --> 3
		
	
		System.out.println("\n2ed  occurence of s ----> ");
		System.out.println(str.indexOf("s", str.indexOf('s') + 1));//2nd occurrence of s
		System.out.println();
		
		//String str = "This is my java code and i am so happy";
		int t = str.indexOf("s", str.indexOf('s') + 1);
		//System.out.println("2ed index:=====  " + t);
		System.out.println("\n3rd  occurence of s ----> ");
		System.out.println(str.indexOf("s", t+1));
		System.out.println();
		
		
		
	    System.out.println(str.indexOf("java"));
	    System.out.println(str.indexOf("Vibha")); // -1
	
	    String s1 = "This is my first Java Code ";
	    System.out.println(s1.toUpperCase());
	    System.out.println(s1.toLowerCase());
	    
	    //trim:
	    String s2 = "       hello world      ";
	    System.out.println(s2.trim());
	    
	    //replace:
	    
	   String s3 = "hello Keshini";
	   System.out.println(s3.replace(" " , ""));
	    
	   String dob = "01-01-1999";
	   System.out.println(dob);
	   System.out.println(dob.replace('-', '/'));
	   
	   String s4 = "I love Java";
	   System.out.println(s4.replace("Java", "Python"));

	   //contains:
	   String userName = "welcome admin";
	   System.out.println(userName.contains("admin")); //true
	
	   
	   if(userName.contains("admin")) {
		   System.out.println("admin is present");
	   }else {
		   System.out.println("admin is not present");
	   }
	
	   
	   // equals:
	   String str1 = "This is Keshini here";
	   String str2 = "This iskeshini here";
	
	System.out.println(str1.equals(str2)); 
	System.out.println(str1.equalsIgnoreCase(str2));
	
	//sub string:
	
	String s5 = "your transaction id is 12345";
	System.out.println(s5.substring(4,10));
	System.out.println(s5.substring(5,10));
	
	System.out.println(s5.substring(5));
	
	System.out.println(s5.substring(s5.indexOf("is") + 3 ));
	System.out.println(s5.substring(s5.indexOf("is") + 3, s5.length()));
	
	
	
	}
	
	

}
