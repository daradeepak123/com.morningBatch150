package arraysLearn;

public class OddEvenArrays {
	
	
	
	public static void main(String args[])
	{
		int num[]=new int[1000];
		int odd[]=new int[500];
		int even[]=new int[500];
		
		
		for(int i=0;i<num.length;i++)
		{
			num[i]=i+1;
		}
		
		int evenCount=0;
		int oddCount=0;
		for(int i=0;i<num.length;i++)
		{
			if(num[i]%2==0)
			{
				even[evenCount++]=num[i];
			}
			else
			{
				odd[oddCount++]=num[i];
			}
			
			
		}		
		for(int aa:even)
		{
			System.out.println(aa);
		}
		System.out.println("*************************");
		for(int aa:odd)
		{
			System.out.println(aa);
		}
		
		
	}
	
	
	
	
	
	
	

}
