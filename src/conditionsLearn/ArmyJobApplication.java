package conditionsLearn;

import java.util.Scanner;

public class ArmyJobApplication {

	public static void main(String[] args) {

		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your name");
		String name=sc.next();
		System.out.println("Enter your age");
		int age=sc.nextInt();
		System.out.println("Enter your quilification");
		String quli=sc.next();
		System.out.println("Enter your percent");
		int perc=sc.nextInt();
		System.out.println("Enter your gender");
		String gender=sc.next();
		System.out.println("enter your height");
		int height=sc.nextInt();
		System.out.println("enter your weight");
		int weight=sc.nextInt();
		System.out.println("Enter your physical fitness true/false");
		boolean pfitness=sc.nextBoolean();
		System.out.println("Enter your mental fitness true/false");
		boolean mfitness=sc.nextBoolean();
		
		
		if(age>=18 & age<=24)    // true & true --> true
		{
			if(quli.equalsIgnoreCase("inter"))
			{
				if(perc>70)
				{
					if(gender.equalsIgnoreCase("male"))
					{
						if(height>=180)
						{
							if(weight>=80)
							{
								if(mfitness & pfitness)
								{
									System.out.println("You are eligible for this job");
								}
								else
								{
									System.out.println("hello "+ name+ ", You are not eligible for this job based on your physical/mental");
									
								}
							}
							else
							{
								System.out.println("hello "+ name+ ", You are not eligible for this job based on your weight");
								
							}
						}
						else
						{
							System.out.println("hello "+ name+ ", You are not eligible for this job based on your height");
							
						}
					}
					else if(gender.equalsIgnoreCase("female"))
					{
						if(height>=160)
						{
							if(weight>=50)
							{
								if(mfitness & pfitness)
								{
									System.out.println("You are eligible for this job");
								}
								else
								{
									System.out.println("hello "+ name+ ", You are not eligible for this job based on your physical/mental");
									
								}
							}
							else
							{
								System.out.println("hello "+ name+ ", You are not eligible for this job based on your weight");
								
							}
						}
						else
						{
							System.out.println("hello "+ name+ ", You are not eligible for this job based on your height");
							
						}

					}
					else
					{
						System.out.println("hello "+ name+ ", You are not eligible for this job based on your gender");
					}
					
				}
				else
				{
					System.out.println("hello "+ name+ ", You are not eligible for this job based on your percentage");
				}
			}
			else
			{
				System.out.println("hello "+ name+ ", You are not eligible for this job based on your qulification");
			}
			
		}
		else
		{
			System.out.println("hello "+ name+ ", you are not eligible for this job based on your age");
		}
		
		
		
		
		
	}

}
