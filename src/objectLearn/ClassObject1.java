package objectLearn;

public class ClassObject1 {
	
	
	int a=500;
	static int b=600;
	
	public static void hello()
	{
		System.out.println("this is hello method");
	}
	
	public void hi()
	{
		System.out.println("this is hi method");
		
	}
	

	public static void main(String[] args) {
		
		System.out.println(b);
		hello();
		ClassObject1 o=new ClassObject1();
		System.out.println(o.a);
		o.hi();
		
		

	}

}
