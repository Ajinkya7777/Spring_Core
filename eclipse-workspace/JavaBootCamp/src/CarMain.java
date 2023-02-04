import java.util.Arrays;

public class CarMain {

	public static void main(String[] args) {
		
		String[] spareParts= new String[] {"breaks","keys"};
		Car nissan= new Car("Nissan",10000.0,"Black","Nissan",spareParts);
		Car honda = new Car(" Honda",2000.0,"Yellow"," Honda",spareParts);
		Car nissan2= new Car(nissan);
		spareParts[0]="spareKeys";
		spareParts[1]="spareBreaks";
			
		nissan2.setName("Nissan2");
		nissan2.setColor("jet Black");
		nissan2.setMake("Nissan2");
		nissan2.setPrice(20000);
		System.out.println(" Name : " +nissan.getName()+" Color : " +nissan.getColor()+" Make : "+nissan.getMake()+" Price : "+nissan.getPrice()+" Parts :"+Arrays.toString(nissan.getParts()) );
		System.out.println(" Name : " +nissan2.getName()+" Color : " +nissan2.getColor()+" Make : "+nissan2.getMake()+" Price : "+nissan2.getPrice()+" Parts :"+Arrays.toString(nissan2.getParts()));
		System.out.println(" Name : " +honda.getName()+" Color : " +honda.getColor()+" Make : "+honda.getMake()+" Price : "+honda.getPrice()+" Parts :"+Arrays.toString(honda.getParts()));
		
	   String[] part=nissan.getParts();
	  nissan.setParts(new String[]{"yellow","Tyre"});
	  
	  System.out.println("\n After changing the values\n");
	  System.out.println(" Name : " +nissan.getName()+" Color : " +nissan.getColor()+" Make : "+nissan.getMake()+" Price : "+nissan.getPrice()+" Parts :"+Arrays.toString(nissan.getParts()) );
	  System.out.println(" Name : " +nissan2.getName()+" Color : " +nissan2.getColor()+" Make : "+nissan2.getMake()+" Price : "+nissan2.getPrice()+" Parts :"+Arrays.toString(nissan2.getParts()));
	  System.out.println(" Name : " +honda.getName()+" Color : " +honda.getColor()+" Make : "+honda.getMake()+" Price : "+honda.getPrice()+" Parts :"+Arrays.toString(honda.getParts()));
	}

}
