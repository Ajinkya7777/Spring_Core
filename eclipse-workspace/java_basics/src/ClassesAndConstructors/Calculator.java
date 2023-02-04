package ClassesAndConstructors;

public class Calculator {
private Floor floor;
private Carpet carpet;
public Calculator(Floor floor, Carpet carpet) {
	
	if (floor==null && carpet==null) {
		System.out.println(" Unable to get Total Cost");
		
	} else {
		this.floor = floor;
		this.carpet = carpet;
	}
	
}

public double getTotalCost() {
	
	if (this.floor==null && this.carpet == null) {
		return 0.0;
		
	} else {
		return (floor.getArea())*(carpet.getCost());
	}
	
}

	
}
