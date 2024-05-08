package constructorLearn;

public class ConstructorBasic {
	
	int a;
	int b;
	ConstructorBasic(int x,int y)
	{
		a=x;
		b=y;
	}
	
	ConstructorBasic(int x)
	{
		a=x;
		
	}
	
	ConstructorBasic()
	{
		System.out.println("this is normal constructor");
		
	}

	public static void main(String[] args) {
		
		ConstructorBasic o=new ConstructorBasic(10,20);
		System.out.println(o.a);

		ConstructorBasic o1=new ConstructorBasic(500,600);
		System.out.println(o1.b);
		
		ConstructorBasic o2=new ConstructorBasic(5000);
		System.out.println(o2.a);
		System.out.println(o2.b);
		ConstructorBasic o3=new ConstructorBasic();
		
	}

}
