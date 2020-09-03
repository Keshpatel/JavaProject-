package JavaSession;

public class Student {
	

	String name;
	int rollnum;
	String cName;
	
	public Student(String name, int rollnum, String cName) {
		
		this.name = name;
		this.rollnum = rollnum;
		this.cName = cName;
	}
	
	
	public static void main(String[] args) {
		
		Student s1 = new Student("Rupali", 10, "Fifth");
		Student s2 = new Student("Vibha", 11, "Forth");
		Student s3 = new Student("Nimpa", 12, "Sixth");

		System.out.println(s1.name+ " " + s1.rollnum + "  "+ s1.cName);
		System.out.println(s2.name+ " " + s2.rollnum + "  "+ s2.cName);
		System.out.println(s3.name+ " " + s3.rollnum + "  "+ s3.cName);
		
		s1 = s2;
		System.out.println();
		System.out.println(s1.name+ " " + s1.rollnum + "  "+ s1.cName);
		System.out.println(s2.name+ " " + s2.rollnum + "  "+ s2.cName);
		System.out.println(s3.name+ " " + s3.rollnum + "  "+ s3.cName);
		
		s2= s3;
		
		System.out.println();
		System.out.println(s1.name+ " " + s1.rollnum + "  "+ s1.cName);
		System.out.println(s2.name+ " " + s2.rollnum + "  "+ s2.cName);
		System.out.println(s3.name+ " " + s3.rollnum + "  "+ s3.cName);
		
		s3 = s1;
		
		System.out.println();
		System.out.println(s1.name+ " " + s1.rollnum + "  "+ s1.cName);
		System.out.println(s2.name+ " " + s2.rollnum + "  "+ s2.cName);
		System.out.println(s3.name+ " " + s3.rollnum + "  "+ s3.cName);
		
	}

}
