package abstractionLearn;

public abstract class Car {
	
	
	public abstract void wheels4();
	public abstract void doors4();
	
	public  void hello()
	{
		
	}
	
	
	

}


class Maruthi extends Car
{

	public void wheels4() {
		System.out.println("Low quality wheels");
		
	}


	public void doors4() {
		
		System.out.println("Low quality doors");
	}
	}

class Tata extends Car
{

	public void wheels4() {
		System.out.println("good quality wheels");
		
	}


	public void doors4() {
		
		System.out.println("good quality doors");
	}
	}