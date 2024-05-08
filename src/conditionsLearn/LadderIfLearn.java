package conditionsLearn;

import java.util.Scanner;

public class LadderIfLearn {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your marks number");
		int marks=sc.nextInt();
		
		if(marks>500)
		{
			System.out.println("YOu will get a bicycle");
		}
		else if(marks>400)
		{
			System.out.println("YOu will get a Outing");
		}
		else if(marks>300)
		{
			System.out.println("YOu will get a New Dress");
		}
		
		else 
		{
			System.out.println("will not promoted to next education");
		}
		
		
		
		
		
	}

}
