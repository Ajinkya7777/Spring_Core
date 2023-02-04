package Demo1;

class SuperMethodDemo {

	public void Swati() {
		System.out.println("My name is Swati Pratap Barnwal");

	}

}

public class SuperMethod extends SuperMethodDemo {

	public static void main(String[] args) {

		SuperMethod sp = new SuperMethod();
		sp.calling();
		

	}

	public void Swati() {
		System.out.println("My name is Swati Ajinkya Shinde");
	}

	public void calling() {
		this.Swati(); // child
		
	}
	
	SuperMethod()
	{
		this.calling();
		
	}

}
//
////when we are having two same methods and if we want to call super class method then we use super keyword 
//and if we want to use sub class method or child class method then we use this keyword . basically we use super and this 
//to differentiate overridden methods.