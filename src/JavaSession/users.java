package JavaSession;

public class users {
	String name;
	int age;
	

	public users(String name, int age) {
		this.name = name;
		this.age = age;
	}


	public static void main(String[] args) {
		users u1 = new users("Tom", 25);
		
		users u2 = new users("Peter", 35);
		
		System.out.println(u1.name + " " + u1.age);
		u1 = null;
		u1= u2;
		System.out.println(u1.name + " " + u1.age);
		System.out.println(u2.name + " " + u2.age);
	}

}
