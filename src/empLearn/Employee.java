package empLearn;

public class Employee {
	
	
	String name;
	int empID;
	int age;
	int sal;
	long phno;
	String email;
	String dept;
	String gender;
	static String company="Quality thought";
	
	
	public void displayDetails(String nam,int id,int ag,int sall,long phn,String mail,String dpt,String gndr)
	{
		System.out.println("Hi, I am "+nam);
		System.out.println("My emp id is "+id);
		System.out.println("My age is "+ag);
		System.out.println("My sal is "+sall);
		System.out.println("My phone number is "+phn);
		System.out.println("My email address is "+mail);
		System.out.println("this is my deptartmenet"+dpt);
		System.out.println(gndr);
		System.out.println("I work with "+company);
	}
	

	public static void main(String[] args) {

		Employee e1=new Employee();
		e1.name="Ram";
		e1.empID=101;
		e1.age=21;
		e1.sal=100000;
		e1.phno=9999999999l;
		e1.email="emp1@gmail.com";
		e1.dept="testing";
		e1.gender="male";
		e1.displayDetails("Ram", 101, 21, 100000, 9999999999l, "ram@gmail.com", "testing", "male");
		
//		System.out.println("Hi, I am "+e1.name);
//		System.out.println("My emp id is "+e1.empID);
//		System.out.println("My age is "+e1.age);
//		System.out.println("My sal is "+e1.sal);
//		System.out.println("My phone number is "+e1.phno);
//		System.out.println("My email address is "+e1.email);
//		System.out.println("this is my deptartmenet"+e1.dept);
//		System.out.println(e1.gender);
//		System.out.println("I work with "+company);
		System.out.println("*******************************************");
		Employee e2=new Employee();
		e2.name="Krish";
		e2.empID=102;
		e2.age=21;
		e2.sal=100000;
		e2.phno=9999999998l;
		e2.email="emp2@gmail.com";
		e2.dept="DevOps";
		e2.gender="male";
		
		e2.displayDetails("Krish", 102, 21, 100000, 9999999998l, "krish@gmail.com", "DevOps", "male");
		
		
		
	}

}
