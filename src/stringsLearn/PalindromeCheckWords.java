package stringsLearn;

public class PalindromeCheckWords {
	
	
	
	public static boolean palCheckWords(String s)
	{
		
		String rev="";
		boolean b=false;
		for(int i=0;i<s.length();i++)
		{
			rev=s.charAt(i)+rev;
		}
		
		if(rev.equals(s))
		{
			b=true;
		}
		else
		{
			b=false;
		}
		
		return b;
	}
	
	

	public static void main(String[] args) {

		
		
		String str="mom and dad are going to meet madam";
		String words[]=str.split(" ");
		for(String ss:words)
		{
			boolean bb=palCheckWords(ss);
			if(bb)
			{
				System.out.println(ss+ " is a palindrome word");
			}
			else
			{
				System.out.println(ss+ " is not a palindrome word");
			}
			
		}
		
		
		
		
	}

}
