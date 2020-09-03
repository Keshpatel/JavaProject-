package JavaSession;

public class DataTypes {

	public static void main(String[] args) {
		// Data Types:
		//1. Primitive data types :
		   //a. Boolean types: boolean : true or false
		   //b. Numerical type: 
		         //1. Character type : Char
		         //2. Integral value:
		               //1. Integer : byte, short , int, long, 
		               //2. floating point : float , double

		//1. byte: 
		//range : - 128 to 127 
		// size : 8 bits = 1 byte

		byte b = 10;
		   b=-20;
		System.out.println(b); 
		byte b1 = -20;
		byte b2 = 0;
		System.out.println(b1);
		System.out.println(b2);


		// 2 short :
		//range : - 3276 to 32767
		//size : 16 bits = 2 bytes 
		short sh = 1000;
		short b3 = 20;
		System.out.println(sh + b3);

		//3. int : 
		// range : -214783648 to 214783647
		//size: 32 bits = 4 bytes
		int i = 100;
		int j = -200;
		int p = 3000;
		int q = 0;

		System.out.println(i+j+p);
		System.out.println((i+j+p)*q);

		//4. long: 
		//range:
		//size: 64 bits = 8 bytes
		long l = 10000;
		long l1= 9000089000l;

		//5. float:
		//range : up to 7 decimal digit (after point you can store 7 decimal 
		//size: 32 bits = 4 bytes
		float f = 12.33f;
		float f1 = (float)34.44;
		System.out.println(f+f1);
		float f3 = 100;
		System.out.println(f3);


		//6. double:
		// range : up to 16 decimal digits
		//size 64 bits = 8 bytes
		double d = 12.3333;

		//7. boolean : true / false:
		boolean flag  = true;
		boolean flag1 = false;
		//boolean isUSCitizen = true;
		if(flag == true)
		{
		   System.out.println(flag); 
		}
		else 
		{
		System.out.println(flag1);
		}

		//8.char : always store as a single digit only and write in ' ' 
		// size: 18 bits = 2 bytes
		char c = 'a';
		char h = 'b';

		char c1 = '1';
		char c2 = '$';

		char gender = 'f';
		char score = 'p';

		//dd = 'testing' ---- not allowed 

		System.out.println(c);
		System.out.println(c + h);
		System.out.println();

		System.out.println("****Using valueOf()*****");
		String str = String.valueOf(c) + String.valueOf(h);
		System.out.println(str);


		System.out.println("*****Using toString()*****");
		String Str = Character.toString(c) + Character.toString(h);
		System.out.println(str);



	}

}
