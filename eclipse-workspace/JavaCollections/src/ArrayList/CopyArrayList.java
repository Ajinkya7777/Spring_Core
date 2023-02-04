package ArrayList;

import java.util.ArrayList;

public class CopyArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ArrayList<String> al= new ArrayList<String>();
	
	al.add("add");
	al.add("minus");
	ArrayList<String> al2= new ArrayList<String>();
	al2.addAll(al);
	System.out.println(al2.toString());
	}

}
