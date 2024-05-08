package arraysLearn;

import java.util.Scanner;

public class ArraysWIthScannerClass {

	public static void main(String[] args) {

		
		int a[]=new int[10];
		Scanner sc=new Scanner(System.in);
		for(int i=5;i<10;i++)
		{
			
			System.out.println("enter desired number at position of "+ i);
			a[i]=sc.nextInt();			
			
		}
		
		for(int abc:a)
		{
			System.out.println(abc);
		}
		
		
		

	}

}
