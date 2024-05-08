package conditionsLearn;

import java.util.Scanner;

public class SimpleIFLearn {

	public static void main(String[] args) {

		// School management says whose marks crossed 500 will put their pics on posters 
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Tell me your name");
		String name=sc.next();
		
		System.out.println("Tell me your total marks");
		int marks=sc.nextInt();
		
		
		if(marks>500)
		{
			System.out.println("hello "+ name + " your picture will be displayed on the poster");
		}
		else
		{
			System.out.println("hello "+ name + " your picture will not be displayed on the poster");
		}
		
		
		
	}

}
