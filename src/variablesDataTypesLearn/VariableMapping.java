package variablesDataTypesLearn;

public class VariableMapping {
	
	int abc;
	static int xyz;
	static boolean bool;

	public static void main(String[] args) {

		VariableMapping obj=new VariableMapping();
		int a =100;
		int b=a;
		b=a=500;
		System.out.println(b);
		
		System.out.println(obj.abc);
		System.out.println(xyz);
		a=obj.abc;
		System.out.println(a);
		b=xyz;
		System.out.println(b);
		System.out.println(bool);
		obj.abc=22;
		xyz=55;
		
		System.out.println(obj.abc);
		System.out.println(xyz);
		
		
		int s=0;
		System.out.println(s);
		
		
		int aa=500;
		int bb=700;
		int cc=0;
		
		cc=bb;
		bb=aa;
		aa=cc;
		System.out.println(aa +" "+ bb);
	}

}
