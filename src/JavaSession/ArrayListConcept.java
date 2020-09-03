package JavaSession;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
				
		ArrayList ar = new ArrayList();
		
		System.out.println(ar.size());
		ar.add(100);//0 position
		ar.add(200);// 1st position
		
		System.out.println(ar.size());
		
		ar.add(300);//2ed position
		ar.add(400);//3rd position
		ar.add(500);//4th position
		
		System.out.println(ar.size());
		
		ar.add(600);//5th position
		ar.add(700);//6th position
		ar.add(800);//7th position
		ar.add("test");//8th
		ar.add(12.33);//9th
		ar.add('a');//10th
		ar.add(true);//11th
		
		System.out.println("Array list Size: " + ar.size()); 
		
		System.out.println("Element at Oth position :" + ar.get(0));
		System.out.println(ar.get(7));
		//System.out.println(ar.get(-1));//Give exception
		
		//Print all the value from array list
		System.out.println("\nArray List printing ");
		for(int i= 0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		
		//integer data Arraylist:
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(10);
		marks.add(20);
		marks.add(30);
		marks.add(40);
		marks.add(50);
		
		//for each loop to print marks 
		for (int i :marks) {
			System.out.println(i);
		}
		//marks.add("test"); // will give error  as declaration is integer.
		
		ArrayList<Double> bmi = new ArrayList<Double>();
		
		ArrayList<String> studentNames = new ArrayList<String>();
		System.out.println("-------------------");
		studentNames.add("Simran");
		studentNames.add("Sesha");
		studentNames.add("Ramya");
		studentNames.add("Shree");
		studentNames.add("Rupali");
		System.out.println(studentNames.get(1));
		
		// for each loop
		int count = 0;
		for(String s : studentNames) {
			System.out.println(s +  " :" + count);
			//System.out.println(count);
			if (s.equals("Shree")){
				System.out.println("She got 100 marks");
			}
			else if(s.equals("Simran")) {
				System.out.println("Poor attendence ");
			}
			else if (s.equals("Ramya")) {
				System.out.println("100% attendence");
			}
			count++;
		}
		
		System.out.println("--------------------------");
		ArrayList <Object> empData = new ArrayList<Object>();  // creating arraylist with different type of data
		empData.add("Vibha");
		empData.add("35");
		empData.add("f");
		empData.add("34.55");
		empData.add("true");
		empData.add("India");
		
		System.out.println("Array printing ");
		for(int i= 0;i<empData.size();i++) {
			System.out.println(empData.get(i));
		}
		
		//System.out.println(empData.get(3)); //34.55
		
		
		for(Object e : empData) {
			System.out.println(e);
		}
		
	}

}
