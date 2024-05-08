package variablesDataTypesLearn;

public class VariablesAndMethods {
	
	int a=100;
	static int b=500;
	
	public void printData()
	{
		int abc=90;
		System.out.println(a+" this is the value of a in the method printData");
		System.out.println(b+ " this is the value of a in the method printData");
	}
	
	public static void printValues()
	{
		VariablesAndMethods o=new VariablesAndMethods();
		System.out.println(o.a+ " this is the value of a in the method printValues");
		System.out.println(b+ " this is the value of a in the method printValues");
		
	}

	public static void main(String[] args) {
		
		
		VariablesAndMethods o=new VariablesAndMethods();
		System.out.println(o.a +" this is main method a value");
		System.out.println(b+ " This is main method b value");
		o.a=66;
		b=77;
		printValues();
		o.printData();
	}

}
