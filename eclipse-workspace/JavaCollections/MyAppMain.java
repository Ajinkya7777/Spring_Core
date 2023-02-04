package com.luv2code.springdemo;

public class MyAppMain {

	public static void main(String[] args) {
		// create the object and use the object

		// BaseballCoach theCoach = new BaseballCoach(); // this line is specific for
		// baseball coach
		// Coach theCoach = new BaseballCoach(); // any coach can use this method
		// because "theCoach" is type of Coach i.e interface type
		Coach theCoach = new TrackCoach(); // any coach can use this method because "theCoach" is type of Coach i.e
											// interface type
		
		//NOTES:-
		// we can handle any type of coach due to interface.
		
		// use the object
		System.out.println(theCoach.getDailyWorkout());
	}
}
