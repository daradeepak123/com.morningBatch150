package conditionsLearn;

import java.util.Scanner;

public class ElseIfLearn {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter desired number");
		int num=sc.nextInt();
		
		boolean bool=num%2==0;
		
		if(bool)
		{
			System.out.println("Given number is even");
		}
		else
		{
			System.out.println("given number is odd");
		}
		
		
		
		
		
	}

}
