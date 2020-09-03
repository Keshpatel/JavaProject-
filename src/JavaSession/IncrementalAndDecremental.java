package JavaSession;

public class IncrementalAndDecremental {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 1;
		int n = m++;
		System.out.println(m);
		System.out.println(n);
		
		int p = -1;
		int q = p++;
		System.out.println(p);
		System.out.println(q);
		
		int h=1;
		int g=++h;
		System.out.println(h);//2
		System.out.println(g);//2
		
		int k = -10;
		int l = ++k;
		System.out.println(k);//-9
		System.out.println(l);//-9
		
		int a = 2;
		int b = a--;
		System.out.println(a);//1
		System.out.println(b);//2
		
		int x= -100;
		int y = x--;
		System.out.println(x);//-101
		System.out.println(y);//-100
		
		int e = -1;
		int d = --e;
		System.out.println(e);//-2
		System.out.println(d);//-2
		
		int i = 9;
//		int div = i/0;
//		System.out.println(div); // undefined
		System.out.println(0/9);
		
		int i1 = 9/2;
		System.out.println(i1);
		
		System.out.println(9.0/2.0);
	}

}
