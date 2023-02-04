package java8features.defaultmethod.com;

public interface ExampleWithJava7 {

	void vehicle(); //by default public abstract 
	String color= "red"; //by default public static final
	void details();

	/*
	 * when we add any abstract method we need to implement or override that abstract
	 * method so that we can implement that interface that is reason defaults
	 * methods have been introduced in java 8 . by making method default i.e when
	 * apply default keyword on method that method becomes default method and then
	 * we can implement that method in that particular interface only and that
	 * method will be available to all the child classes which are implementing that
	 * interface. if we want to add that default in our child class then we can add
	 * that and if we don't need to add that method in our child class then we don't
	 * need to touch that method , it is not mandatory to override these defaults
	 * method we can call them by b=creating object of that class.
	 * suppose we have 100 classes in our project and those classes are implementing
	 * interface . and there is requirement from client we need to add method in interface 
	 * but the problem is all of the child classes need to override that method because 
	 * it is not default method so and there is particular classes only needs to 
	 * implement these new method . so in such cases we can take help of default method.
	 */
}


