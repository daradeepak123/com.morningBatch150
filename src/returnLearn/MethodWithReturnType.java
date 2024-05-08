package returnLearn;

public class MethodWithReturnType {

	public static int num()
	{
		int a=100,b=200,c;
		//System.out.println(c=a+b);
		c=a+b;
		return c;
	}


	public static boolean numCheck(int a)
	{
		boolean bool=a<100;   //300<100
		
		return bool;
	}
	
	
	
	public static void main(String args[])
	{
		int a=num();
		System.out.println(a);
		
		boolean ab=numCheck(a);
		System.out.println(ab);
		
	}






}
