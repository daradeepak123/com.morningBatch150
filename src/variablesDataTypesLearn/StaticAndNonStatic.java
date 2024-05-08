package variablesDataTypesLearn;

public class StaticAndNonStatic {
	
	
	static int abc=500;
	static int xyz=1000;
	int w=600;
	
	
	public void hi()
	{
		System.out.println(abc);
		System.out.println(w);
		hello();
		System.out.println("this is hi method");
	}
	
	public static void hello()
	{
		System.out.println("this is hello method");
	}

	public static void main(String[] args) {
		
		hello();
		int a=600;
		System.out.println(a);
		a=20;
		System.out.println(a);
		System.out.println(abc);
		System.out.println(xyz);
		abc=300;
		xyz=500;
		System.out.println(abc);
		System.out.println(xyz);
		
		
		
		
	}

}
