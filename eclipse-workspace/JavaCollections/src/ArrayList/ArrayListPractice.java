package ArrayList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.stream.Collectors;

public class ArrayListPractice {

	public static void main(String[] args) {
	
		ArrayList<Integer> whole= new ArrayList<Integer>();
		
		for(int i=0;i<10;i++) {
			whole.add(1);
		}

		for(int i=0;i<whole.size();i++) {
			System.out.print(whole.get(i).valueOf(i));
		}
		int i=10;
		Integer integer=Integer.valueOf(i);
		System.out.print("\n converted to Integer: "+integer +" \n");
		//autoBoxing
		int i2=integer.intValue();
		System.out.println("size of an array " + whole.size());
		whole.add(Integer.parseInt("89"));
		System.out.println(whole.toString());
		whole.add(2);
//		
//		for(int j=0;j<whole.size();j++) {
//			System.out.print(whole.get(j).valueOf(j));
//		}
		System.out.println(" the distinct element is " +whole.stream().distinct().collect(Collectors.toList()));
		
		System.out.println(" the distinct element is " +whole.stream().sorted().collect(Collectors.toList()));
		
		HashSet<Integer> hs= new HashSet<Integer>(whole	);
		System.out.println(" using hashset values we got the distinct values");
		for(Integer dist:hs) {
			System.out.println(dist);
		}
		
	}

}
