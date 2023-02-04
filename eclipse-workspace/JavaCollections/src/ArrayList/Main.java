package ArrayList;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		 ArrayList<IntegerClass> intList= new ArrayList<IntegerClass>();
		 intList.add(new IntegerClass(56));
		 System.out.println(intList.get(0).getNo());
	}
}
