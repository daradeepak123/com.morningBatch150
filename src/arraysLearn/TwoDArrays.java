package arraysLearn;

public class TwoDArrays {

	public static void main(String[] args) {
		
		
		
		int a[]= {1,3,4,5,6,};
		int ab[][]= {
					{1,2,3},
					{1,2,3},
					{1,2,3},
					{1,2,3}
					};
		
		

		int s[][]=new int[5][5];
		int count =1;
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				s[i][j]=count++;
			}
		}
		
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				
				System.out.print(s[i][j]+"     ");
			}
			System.out.println();
		}
		
	}

}
