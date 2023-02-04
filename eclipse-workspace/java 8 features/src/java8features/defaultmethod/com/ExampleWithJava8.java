package java8features.defaultmethod.com;

public interface ExampleWithJava8 {

	default void vehicle()
	{
		System.out.println("this is default method in java introduced in java 8 features ");
	}
	
	default void details ()
	{
		
	}
	
	/*
	 * in default method , here we have two default method vehicle() and details()
	 * in bus class we added or called only one method and in car class we have
	 * added both of these methods . so that it proves it is available to each child
	 * class which implements that interface. so when we create object for child
	 * class we can access these methods and also if we don't want to add a
	 * particular method to our class so we can ignore that method as we know that
	 * it is not mandatory to override default methods. and suppose in future we
	 * need to add one method and that we have thousands of classes in our project
	 * so we can make that method default and use that methods logic depending on
	 * our requirements. so basically defaults methods supports background
	 * compatibility. and we can have as many defaults methods we want .
	 */
}
