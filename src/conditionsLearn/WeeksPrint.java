package conditionsLearn;

import java.util.Scanner;

public class WeeksPrint {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int week=sc.nextInt();
		if(week==1)
		{
			System.out.println("Monday");
		}
		else if(week==2)
		{
			System.out.println("Tuesday");
		}
		else if(week==3)
		{
			System.out.println("Wed");
		}
		else if(week==4)
		{
			System.out.println("Thursday");
		}
		else if(week==5)
		{
			System.out.println("Friday");
		}
		else if(week==6)
		{
			System.out.println("Saturday");
		}
		else if(week==7)
		{
			System.out.println("Sunday");
		}
		else
		{
			System.out.println("Please enter numbers between 1-7");
		}
		
	}

}
