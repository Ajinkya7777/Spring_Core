package Learning;

import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;

public class Employee {

	private int age ;
	private String name;
	public Employee(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
  
	@Override
	public String toString() {
		return "Employee_Age = "+this.age+" Employee_Name = "+this.name; 
	}
	
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee(10, "aj");
		Employee e2 = new Employee(11, "sw");
		ArrayList<Employee> emp= new ArrayList<Employee>();
		emp.add(e1);
		emp.add(e2);
		System.out.println(emp);
		
	}
}
