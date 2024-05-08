package loopsLearn;

public class NestedLoops {

	public static void main(String[] args) {

		int uCount=0;
		int iCount=0;
		for(int i=1;i<3;i++)
		{
			uCount++;
			for(int j=1;j<=3;j++)
			{
				iCount++;
			}
			
		}
		
		
		System.out.println(uCount);

		System.out.println(iCount);
		
		
	}

}
