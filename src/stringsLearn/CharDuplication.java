package stringsLearn;

public class CharDuplication {

	public static void main(String[] args) {

		String str="hello";
		for(int i=0;i<str.length();i++)
		{
		int fIndex=str.indexOf(str.charAt(i));
		int lIndex=str.lastIndexOf(str.charAt(i));
		
		if(fIndex==lIndex)
		{
			System.out.println(str.charAt(i)+ " given char is not getting duplicated");
		}
		else
		{
			System.out.println(str.charAt(i)+ " Given char is duplicated");
		}
		
		
			
		}
		
		
		
		
		
	}

}
