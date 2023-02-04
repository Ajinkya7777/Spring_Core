package testing;

import StatergyPattern.Singelton;

public class SingletonPattern {
	
	public static void main(String[] args) {
		//now here we're unable to make default constructor call bcz constructor is private and 
		//outside of that class it is not accessible so that we need to use static factory method 
		//of a singleton class to create object which will give us one object only .
		// even if we call the factory method multiple times we will get same reference of a object
		

		//Singelton single = new Singelton(); // this will not work bcz we made constructor private
		
		
		//calling the factory method of singleton class which is used to create the object .
		Singelton singleton1=Singelton.createInstance();
		Singelton singleton2=Singelton.createInstance();
		
		//checking the hashcodes of the both object created , which should be equal to each other
		System.out.println("Singleton1 :"+singleton1.hashCode()+" Singleton2 :"+singleton2.hashCode());
		
		//checking the references are equal or not if equal we will get true or else we will get false
		System.out.println("Singleton1==Singleton2: " +(singleton1==singleton2));
	}
}
