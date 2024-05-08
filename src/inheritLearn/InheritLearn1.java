package inheritLearn;

import java.util.Scanner;

public class InheritLearn1 {
	
	
	
	public static int a=100;
	static int b=300;
	protected static int w=700;
	private static int g=700;
	
	public static void helloo()
	{
		System.out.println(g);
	}
	
	
	
	int xyz=60;
	
	
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		
		InheritLearn1 o=new InheritLearn1();
		o.xyz=30;
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void hello()
	{
		System.out.println("THis is hello method");
	}
	
	
	static int abc=500;
	
	

}
