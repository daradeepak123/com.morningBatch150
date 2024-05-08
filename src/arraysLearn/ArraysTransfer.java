package arraysLearn;

import java.util.Scanner;

public class ArraysTransfer {

	public static void main(String[] args) {

		String str[]=new String[5];
		String strr[]=new String[str.length];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<str.length;i++)
		{
			System.out.println("enter the data");
			str[i]=sc.next();
		}
		
		
		for(int i=0;i<str.length;i++)
		{
			strr[i]=str[i];
		}
		
		for(String s:strr)
		{
			System.out.println(s);
		}
		
		
	}

}
