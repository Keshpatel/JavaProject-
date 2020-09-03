package JavaSession;

public class DataConversion {

	public static void main(String[] args) {
		
		
		String x = "100";
		
		System.out.println(x+20);
		
		//String to int 
		int i = Integer.parseInt(x);
		System.out.println(i+20);
		
		//String y = "100A";   // NumberFormatException
		//System.out.println("------------> "+ (y+20)); // NumberFormatException
		
		
		String y = "100"; 
		System.out.println("===========> "+ (y+20));
		
		int k = Integer.parseInt(y);
		System.out.println(k+20);
		
		//String to double:
		
		String t = "12.33";
		System.out.println(t+20);
		
		double d = Double.parseDouble(t);
		System.out.println(d+2000);
		
		//int to String : // Double to String ;
		
		int h = 100;
		
		System.out.println(h+20);
		
		String h1 = String.valueOf(h);
		
		System.out.println(h1);   // "100"
		
		System.out.println(h1+20);
		
		
		
		
	}

}
