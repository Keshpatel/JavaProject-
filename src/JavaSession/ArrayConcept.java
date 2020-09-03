package JavaSession;

public class ArrayConcept {

	public static void main(String[] args) {
		
		// Array
		//1.Static Array: Size of the array is fix.
		//2.Only store similar type of data
		// To overcome this problem we have Array List .
		
		
		
		
		// int array:  you can only store nt value in to int array
		int i[] = new int[5];
	
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		i[4] = 50;
		
		System.out.println("li=" +0);
		System.out.println(i.length);
		System.out.println("Hi = "+(i.length-1));
		
		System.out.println(i[0]);
		System.out.println(i[4]);
		//System.out.println(i[5]);
		//System.out.println(i[-1]);
	
		System.out.println("Printing Int  array is");
	for (int k = 0; k<5; k++)
		System.out.println(i[k]);

	//Double Array :
	double d[] = new double[20];
	d[0] = 12.33;
	d[1] = 23.44;
	
	System.out.println(d[0]+d[1]);
	
	//Char Array:
	char c[] = new char[2];
	
	c[0] = 'a';
	c[1] = 'b';
	
	System.out.println(c[0]+c[1]);
	
	//String Array:
	String empNames[] = new String[3];
	empNames[0] = "Tom";
	empNames[1] = "Naveen";
	empNames[2] = "peter";
	
	System.out.println("Printing String Array");
	for(int p=0; p<empNames.length;p++) {
		System.out.println(empNames[p]);
	}
	
	for (String s : empNames) {
		System.out.println(s);
		
	}
	
	//Have to store diff types of info of an emp : name, age, salary, gender, isPermananet
	//Object Array:
	Object empData[] = new Object[5];
	empData[0] = "Vibha";
	empData[1] = 25;
	empData[2] = "f";
	empData[3] = true;
	empData[4] = "34.55";
	
	for(int s=0;s<empData.length;s++) {
		System.out.println(empData[s]);
	}
	
	System.out.println("------2ed emp--------");
	Object empData1[] = new Object[5];
	empData1[0] = "Naveen";
	empData1[1] = 25;
	empData1[2] = "f";
	empData1[3] = false;
	empData1[4] = "34.55";
	
	int m=0;
	while(m<5) {
		System.out.println(empData1[m]);
		m++;
	}
	
	
	
	
	
	}

}
