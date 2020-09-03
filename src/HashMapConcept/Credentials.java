package HashMapConcept;

import java.util.HashMap;

public class Credentials {
	static  HashMap<String ,String> credMap = new HashMap <String , String >();

	public static void main(String[] args) {
				//customer
				//seller
				//distributor
				//vendor
				//partners
				//categorymanager	
		
		
		credMap = new HashMap <String , String >();
		
		credMap.put("customer", "Keshini@gmail.com : Test123");
		
		credMap.put("seller", "rupali@gmail.com : Test123555");
		credMap.put("distributor", "tom@gmail.com : Test123666");
		credMap.put("vendor", "mera@gmail.com : Test12377");
		credMap.put("partner", "diya@gmail.com : Test12388");
		//credMap.put("partner", "disha@gmail.com : Test1238877");
		credMap.put("categorymanager", "kavya@gmail.com : Test123889");
		
		Credentials obj = new Credentials();
		//obj.doLogin(credMap.get("customer").split(":")[0].trim(),credMap.get("customer").split(":")[1].trim());
		
		obj.doLogin("customer");
		obj.doLogin("seller");
		obj.doLogin(credMap.get("partner").split(":")[0].trim(), credMap.get("partner").split(":")[1].trim());
	}

	public void doLogin(String role) {
		String username = credMap.get(role).split(":")[0].trim();
		String passward = credMap.get(role).split(":")[1].trim();
		System.out.println("Login with :" + username + " and" + passward);
		
	}
	public void doLogin(String usename, String passward) {
		
		System.out.println("Login with :" + usename + " and" + passward);
		
	}
	
	
	
}
