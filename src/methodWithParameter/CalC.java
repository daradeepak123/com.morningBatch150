package methodWithParameter;

public class CalC {
	
	
	public void add(int a,int b)
	{
		int x=a,y=b,c;
		c=x+y;
		System.out.println(c);
	}
	
	public void add(int a,int b,int ab)
	{
		int x=a,y=b,z=ab,c;
		c=x+y+z;
		System.out.println(c);
	}
	
	
	

	public static void main(String[] args) {

		CalC c=new CalC();
		c.add(100, 200);
		c.add(800,800,0);
	
	}

}
