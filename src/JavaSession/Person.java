package JavaSession;

public class Person {

		//class variables
	String name;
	int age;
	double weight;
	char gender;
	String dob;
	
	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.name = "Keshini";
		p1.age = 15;
		p1.weight = 60;
		p1.gender = 'f';
		p1.dob = "14-07-2005";
		
		Person p2 = new Person();
		p2.name = "Naveen";
		p2.age = 18;
		p2.weight = 61;
		p2.gender = 'm';
		p2.dob = "14-07-2002";
		
		Person p3 = new Person();
		p3.name = "janak";
		p3.age = 70;
		p3.weight = 110;
		
		Person p4 = new Person();
		
		//new Person.name = "Tom";
		//new Person ().age = 25;
		
		
		
		System.out.println(p1.name  + "\t "+ p1.age + "\t"+ p1.weight + "\t" + p1.gender + "\t" + p1.dob);
		System.out.println(p2.name  + "\t"+ p2.age + "\t"+ p2.weight + "\t " + p2.gender + " \t" + p2.dob);
		System.out.println(p3.name  + " \t" + p3.age);
		System.out.println(p4.name  + "\t "+ p4.age + " \t"+ p4.weight + "\t " + p4.gender + "\t" + p4.dob);
		

	}

}
