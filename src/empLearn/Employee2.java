package empLearn;

public class Employee2 {
	
	
	String name;
	int empID;
	int age;
	int sal;
	long phno;
	String email;
	String dept;
	String gender;
	static String company="Quality thought";
	
	Employee2(String nam,int id,int ag,int sall,long phn,String mail,String dpt,String gndr)
	{
		name=nam;
		empID=id;
		age=ag;
		sal=sall;
		phno=phn;
		email=mail;
		dept=dpt;
		gender=gndr;
	}
	
	
	public void displayDetails()
	{
		System.out.println("Hi, I am "+name);
		System.out.println("My emp id is "+empID);
		System.out.println("My age is "+age);
		System.out.println("My sal is "+sal);
		System.out.println("My phone number is "+phno);
		System.out.println("My email address is "+email);
		System.out.println("this is my deptartmenet"+dept);
		System.out.println(gender);
		System.out.println("I work with "+company);
	}
	

	public static void main(String[] args) {

		Employee2 e1=new Employee2("Ram", 101, 21, 100000, 9999999999l, "ram@gmail.com", "testing", "male");
		e1.displayDetails();
//		e1.name="Ram";
//		e1.empID=101;
//		e1.age=21;
//		e1.sal=100000;
//		e1.phno=9999999999l;
//		e1.email="emp1@gmail.com";
//		e1.dept="testing";
//		e1.gender="male";
		
		
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
		Employee2 e2=new Employee2("Krish", 102, 21, 100000, 9999999998l, "krish@gmail.com", "DevOps", "male");
		e2.displayDetails();
//		e2.name="Krish";
//		e2.empID=102;
//		e2.age=21;
//		e2.sal=100000;
//		e2.phno=9999999998l;
//		e2.email="emp2@gmail.com";
//		e2.dept="DevOps";
//		e2.gender="male";
		
		
		
		
		
	}

}
