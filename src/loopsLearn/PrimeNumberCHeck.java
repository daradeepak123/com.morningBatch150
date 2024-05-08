package loopsLearn;

import java.util.Scanner;

public class PrimeNumberCHeck {
	
	
	public static void primeNumChk(int num)
	{
		boolean flag=false;
		for(int i=2;i<num;i++)
		{
			
			if(num%i==0)
			{
				flag=true;
				System.out.println(num +" is divisible by " +i);
				break;
			}
		}
		
		if(flag)
		{
			System.out.println("Given number is not "+num+" a prime number");
		}
		else
		{
			System.out.println("Given number is "+num+" a prime number");
		}
		
	}

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Desired number");
		int num=sc.nextInt();
		
		primeNumChk(num);
		
		
		
	}

}
