package JavaSession;

public class ComTest {

	public static void main(String[] args) {
		
		
		Company c2 = new Company("HCL", 1900, "Noida", "HCL", "Hr Policy");
		System.out.println(c2.name);
		System.out.println(c2.getPolicy());
		c2.getEmpData();
		
	}

}
