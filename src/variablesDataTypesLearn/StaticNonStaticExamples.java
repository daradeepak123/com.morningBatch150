package variablesDataTypesLearn;

public class StaticNonStaticExamples {

	
	int a=500;
	static int abc=600;
	
	public void hello()
	{
		System.out.println("This is hello method");
	}
	public static void hi()
	{
		System.out.println("This is hi method");
	}
	
	public static void main(String[] args) {

		int xyz=700;
		
		hi();
		System.out.println(abc);
		System.out.println(xyz);
		StaticNonStaticExamples obj=new StaticNonStaticExamples();
		System.out.println(obj.a);
		obj.hello();
	}

}
