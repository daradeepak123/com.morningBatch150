package stringsLearn;

public class StringFunctions {

	public static void main(String[] args) {

		
		String str="hello123(Dll";
		String ss=new String("Quality");
		
		String sent="Welcome to quality thought";
		
		
		System.out.println(str.charAt(1));
		System.out.println(str.concat(ss));
		
		System.out.println(str.contains("h"));
		System.out.println(str.contentEquals("hello123D"));
		System.out.println(str.endsWith("hello123(D"));
		System.out.println(str.equals("hello123(d"));
		System.out.println(str.equalsIgnoreCase("hello123(d"));
		System.out.println(str.indexOf('l'));
		System.out.println(str.lastIndexOf('l'));
		System.out.println(str.length());
		System.out.println();
		
		char ch[]=str.toCharArray();
		
		String word[]=sent.split(" ");
		
		System.out.println();
	}

}
