package comparatorVScomparable;

import java.util.Arrays;
import java.util.Scanner;

public class ComparatorMain {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		
		 
		 System.out.println(" enter the no of students");
		int noOfStudents = input.nextInt();
		Student[] s = new Student[noOfStudents];
		for (int i = 0; i < s.length; i++) {

			System.out.println(" enter the rollno of the student ");
			int rollNo = input.nextInt();
			input.nextLine();
			System.out.println(" enter the name of the student ");
			String name = input.nextLine();
			input.nextLine();

			s[i] = new Student(name, rollNo);
		}
		// Collections.sort(list);

		System.out.println(" sorting using names/string");

		Arrays.sort(s, new Comparators1());
		
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}

		System.out.println(" sorting using integers/rollnos");

		Arrays.sort(s, new Comparators2());
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}

	}
}
