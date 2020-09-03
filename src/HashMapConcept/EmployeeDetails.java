package HashMapConcept;

import java.util.HashMap;
import java.util.Map;

public class EmployeeDetails {

	public static void main(String[] args) {
		//Key Value pair -- It is order-less collection 
		
		HashMap<String , String> EmpMap = new HashMap<String , String>();
		EmpMap.put("name", "Keshini");
		EmpMap.put("e-mail", "kdpatel8184@gmail.com");
		EmpMap.put("city", "Calgary");
	
		System.out.println(EmpMap.get("name"));
		System.out.println(EmpMap.get("city"));
		System.out.println(EmpMap.get("test"));  //Give null 
		
		
		//entrySet(), getkey(), getvalue()
		for(Map.Entry<String, String> e : EmpMap.entrySet()) {
			System.out.println("Key = " + e.getKey() + " Value = "+ e.getValue());
		}
		
		//keySet()
		for (String s : EmpMap.keySet()) {
			System.out.println("Keys = " + s);
		}
		
		//values()
		for(String v: EmpMap.values()) {
			System.out.println("Values = " + v);
		}
		
		//for each with lambda expression :
		
		EmpMap.forEach((k,v) -> System.out.println("key = " +k + " Values = " +v));
		
		//int HashMap
		HashMap<String , Integer> studentMarks = new HashMap<String , Integer>();
		studentMarks.put("punet", 90);
		
		studentMarks.put("ravi", 80);
		
		
		
		
		
		
		
		
	}

}
