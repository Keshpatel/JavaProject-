package JavaSession;

public class SwitchCaseConcept {

	public static void main(String[] args) {
		
		int num = 1;
		
		switch (num) {
		case 1: 
			System.out.println("hii");
			break;
		case 2: 
			System.out.println("hello");
			break;
		case 10: 
			System.out.println("bye");
			break;
		
		default:
			break;
		}
	

	
	String browser = "chrome";
	
	
	switch (browser) {
	
	case "chrome": 
		System.out.println("hii");
		break;
	case "firefox": 
		System.out.println("hello");
		break;
	case "Safari": 
		System.out.println("bye");
		break;
	
	default:
		System.out.println("browser not found"  +browser);
		break;
	}
	
	}	
	
	
}	
	
	
	
	
	
	
	


