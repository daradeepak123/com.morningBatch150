package operatorsLearn;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;

public class ArithematicAllLogics {
	
	int a,b;
	static ArithematicAllLogics o=new ArithematicAllLogics();
	public void sum()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value in numbers");
		a=sc.nextInt();
		System.out.println("Enter b value in numbers");
		b=sc.nextInt();
		int c=a+b;
		System.out.println(c);
		
		
		
	}
	
	public static  void sub()
	{
		
		o.a=100;
		o.b=60;
		int c=o.a-o.b;
		System.out.println(c);
		
	}
	
	
	
	
}
