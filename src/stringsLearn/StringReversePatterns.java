package stringsLearn;

import java.util.Scanner;

public class StringReversePatterns {

	public static void main(String[] args) {

		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter desired string");
		String str=sc.next();
		
		String rev="";
		
		for(int i=0;i<str.length();i++)
		{
			rev=str.charAt(i)+rev;
			
		}
		System.out.println(rev);
		
		
		if(str.equals(rev))
		{
			System.out.println(str+ " is a palindrome word");
		}
		else
		{
			System.out.println(str+ " is not a palindrome word");
		}
		
		
	}

}
