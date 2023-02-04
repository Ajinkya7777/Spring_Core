package comparatorVScomparable;

import java.util.Comparator;
//compartor used to compare based on their string/names
public class Comparators1 implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		String s1 = o1.getName();
		String s2 = o2.getName();
		return s1.compareTo(s2);
		
	}

}

class Comparators2 implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
	    Integer rollNo1 = o1.getRollNo();
	    Integer rollNo2 = o2.getRollNo();
		return  rollNo1.compareTo(rollNo2);
	}
	 
}
