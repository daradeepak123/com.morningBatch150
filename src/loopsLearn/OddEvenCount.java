package loopsLearn;

public class OddEvenCount {

	public static void main(String[] args) {

		int evenCount=0;
		int oddCount=0;
		for(int i=50;i<=100;i++)
		{
			if(i%2==0)
			{
			evenCount++;
			System.out.println(i+ " is a even number");
			}
			else
			{
			oddCount++;
			System.out.println(i+ " is a odd number");
			} 
		}
		
		System.out.println("even count is "+ evenCount);
		System.out.println("odd count is "+ oddCount);
	}

}
