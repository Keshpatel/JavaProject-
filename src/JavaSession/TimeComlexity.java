package JavaSession;

public class TimeComlexity {

	public static void main(String[] args) {
		
		//TC -- > 0(n)
		
		int i=1;
		
		System.out.println(i);
		// 0(1)
		
		
		String s= "selenium";
		System.out.println(s + " testing");

		for (int k = 1 ;k<=10 ;k++) {
			System.out.println(k);
		}

//o(n)
//1 + n  + n  ==> 1+3n ==> 3n ==> O(n)
//linear equation

for (int m=1; m<=10; m++) {
	for (int n=1;n<=10;n++) {
		System.out.println(m + " " + n);
	}
	System.out.println();
}

//(1 + n + n) * (1 + n + n+ n) + n  ==> (1+3n) *( 1+3n) == > 1+3n +3n +3n + 9n^2 == > 1+ 6n+9n^2
//9n^2 + 6n + 1 ==> Quadratic Equation
//9n^2 = 6n ==> n^2 + n -->O(n^2)


	}

}
