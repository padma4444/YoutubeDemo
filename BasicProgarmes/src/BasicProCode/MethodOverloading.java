package BasicProCode;

public class MethodOverloading {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
   add(40,30);
   MethodOverloading a=new MethodOverloading();
   a.add(3,2);
	}
	public static int add(int a, int b) {
		System.out.println(a+b);
		return a+b;
		
	}
	public short add(short c, short d)
	{
		System.out.println(c*d);
		return (short) (c*d);
		
	}

}
