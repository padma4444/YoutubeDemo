package BasicProCode;

public class ClassConstructor {
     int length;
     int bredth;
     int height;
	
	public int getCubeVolume()
	{
		
		return length*bredth*height;
		
	}
	public ClassConstructor(int l, int b, int h) {
		// TODO Auto-generated constructor stub
		this.length=l;
		this.bredth=b;
		this.height=h;
		
		System.out.println("We are in Constructor");
		
	}

}
