package objectLearn;

public class ClassObject2 {

	public static void main(String[] args) {

		ClassObject1 o=new ClassObject1();
		System.out.println(ClassObject1.b);
		System.out.println(o.a);
		
		
		ClassObject1.hello();
		o.hi();

		int abc=o.a;
		
		
	}

}
