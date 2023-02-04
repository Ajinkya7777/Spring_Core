package comparatorVScomparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Students implements Comparable<Students>  {

	private int rollNo;
	private String name ;
	public Students() {
		// TODO Auto-generated constructor stub
	}
	public Students(String name,int rollNo) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Students [ name=" + name + "]";
	}
	@Override
	public int compareTo(Students o) {
	
//		String name1 = o.getName();
//		String name2 = o.getName();
//		//return name1.compareTo(name2);
//		if (name1.equals(name2)) {
//			return 0;
//		}
//		int i=name1.compareTo(name2);
//		if (i==1) {
//			return 1;
//		}
//		else {
//			return -1;
//		}
		
//		if (this.getName().equals(o.getName())) {
//			return 0;
//		}
//		else {
			return this.getName().compareTo(o.getName());
		//}
	}
//	public static int sortByName(Students o1,Students o2) {
//		return o1.getName().compareTo(o2.getName());
//	}
		
	
	
	public static void main(String[] args) {
		//Students s = new Students()	;
		List<Students> student = new ArrayList<Students>();
		Students s1 = new Students("zjinkya",1);
		Students s2 = new Students("fwati",2);
		
		student.add(s1);
		student.add(s2);
		System.out.println("before sorting");
		System.out.println(student);
		//Collections.sort(student);
		//System.out.println(student);
		//sortByName(s1,s2);
		  Collections.sort(student);
		//int result =s1.compareTo(s2);
		
//		switch (result) {
//		case 0:
//			System.out.println("equal");
//			
//			break;
//		case 1:
//			System.out.println("greater than");
//			break;
//		case -1:
//			System.out.println("lesser than");
//		break;
//		}
		
		System.out.println("after sorting");
      for (Students students : student) {
    	
		System.out.println(students);
	}
	}
	
}
