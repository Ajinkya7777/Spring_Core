import java.util.Arrays;

public class ReferenceMain {

	public static void main(String[] args) {
		
	//	String[] names = new String[] {"Ajinkya","Shinde"};
		
		 RefrenceTrap rf1= new RefrenceTrap(new String[] {"Ajinkya","Shinde"});
		 RefrenceTrap rf2= new RefrenceTrap(new String[] {"Ajinkya","Shinde"});
		 RefrenceTrap rf3= new RefrenceTrap(rf1);
		 
		 
		 //names[0]="ajinkya";
		 
		 System.out.println(Arrays.toString(rf1.getNames()));
		 System.out.println(Arrays.toString(rf2.getNames()));
		 System.out.println(Arrays.toString(rf3.getNames()));
		 
		 String[] names=  {"ajinkya","Shinde"};
		 
		 //rf3.setNames({"Shinde","Ajinkya"});
		 rf3.setNames(names);
		 System.out.println();

		 System.out.println(Arrays.toString(rf1.getNames()));
		 System.out.println(Arrays.toString(rf2.getNames()));
		 System.out.println(Arrays.toString(rf3.getNames()));
		 
	}

}
