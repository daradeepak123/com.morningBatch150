package operatorsLearn;

public class ExecutionCLass {

	public static void main(String[] args) {
		ArithematicAllLogics o=new ArithematicAllLogics();
		o.sum();
		
		
		int a=100;
		int b=20;
		
		
		System.out.println(a<b);
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		
		ComparatorOperatorAllLogics oo=new ComparatorOperatorAllLogics();
		oo.lessThan(10, 20);
		System.out.println("***************");
		int xyz=1000;
		
		xyz+=1000;
		System.out.println(xyz);
		xyz-=1000;
		System.out.println(xyz);
		xyz*=10;
		System.out.println(xyz);
		xyz/=10;
		System.out.println(xyz);
		xyz%=2;
		System.out.println(xyz);
		System.out.println("***********************");
		int aa=1;
		aa++;
		System.out.println(aa);
	}

}
