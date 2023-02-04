package java_arrays;

//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.Iterator;
//import java.util.ListIterator;
import java.util.*; //to import all the classes in a particular packages

public class ArrayListDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// without Generic class
		System.out.println("ArrayList without Generics Type <>");
		Collection<Comparable> alg = new ArrayList<Comparable>();
		alg.add(1);
		alg.add(null);
		alg.add("Ajinkya");
		alg.add('a');
		System.out.println(alg.toString());
		System.out.println();

		System.out.println("ArrayList with Generics Type <>");

		// generic arrayList
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		System.out.println(al);
		System.out.println(al.toString());

		System.out.println(al.size());
		System.out.println(al.get(4));

		System.out.println("\n using for each loop");
		for (Integer all : al) {
			System.out.print("\t" + all + "\n");
		}

		System.out.println(" \nusing for each tradional loop");
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		Iterator<Integer> it = al.iterator(); // declaring iterator

		System.out.println("using iterator ");
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("using List Iterator ");

		ListIterator<Integer> lr = al.listIterator();
		while (lr.hasNext()) {
			System.out.println(lr.next());

		}
		System.out.println("demo of for each method :");
		al.forEach((x) -> System.out.println(x));
		System.out.println(al.contains(5));
		boolean b = al.contains(5);
		System.out.println(b);
		System.out.println("object cloned ");
		System.out.println(al.clone());
		System.out.println(al.indexOf(5));
		System.out.println(al.isEmpty());
		System.out.println(al.iterator());
		System.out.println(al.remove(0));
		System.out.println(al);

		System.out.println(lr);
		System.out.println(it);
	}

}
