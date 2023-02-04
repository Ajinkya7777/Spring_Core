package Learning;

public class Student implements Comparable<Student> {

	private int age;
	private String name;
	public Student(int age, String name) {
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
	//@Override
	public int compareTo(Student per) {
		
		System.out.println("per.age =" +per.age);
		System.out.println("this.age =" +this.age);
		if (this.age==per.age) {
			return 0;
		}
		
		else {
			return this.age>per.age? -1:1 ;
		}
	}
	
public static void main(String[] args) {
		
		Student s1= new Student(-1, "ajq");
		Student s2= new Student(1, "aj");
		
		int comp= s2.compareTo(s1);
		
		switch (comp) {
		case 0:
			System.out.println(" equal " +comp );
			break;
			
		case 1: 
			System.out.println(" greater than " +comp);
			break;
		
		case 2: 
			System.out.println(" less than " +comp);
			break;
		
		}
			
		}
}
