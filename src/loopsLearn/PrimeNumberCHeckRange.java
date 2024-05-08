package loopsLearn;

public class PrimeNumberCHeckRange {
	
	
	
	public static boolean primeNumChk(int num)
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
		
		return flag;
		
	}
	

	public static void main(String[] args) {

		
		for(int i=1;i<=100;i++)
		{
			int num=i;
			boolean flag=false;

			
			
			flag=primeNumChk(num);
			
			
			if(flag)
			{
				System.out.println("Given number is not "+num+" a prime number");
			}
			else
			{
				System.out.println("Given number is "+num+" a prime number");
			}
			
			
		}
		
		
		
		
		
		
		
		
	}

}
