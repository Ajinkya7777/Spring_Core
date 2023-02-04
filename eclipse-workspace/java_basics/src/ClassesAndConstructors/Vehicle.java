package ClassesAndConstructors;

public class Vehicle {
	
	private String handSteering;
	private int ChangingGears;
	 private int speed;  
	  	 	
	 public Vehicle(String handSteering,int ChangingGears,int speed) {
	this.handSteering=handSteering;
	this.ChangingGears=ChangingGears;
	this.speed=speed;
		 
	}

	public String getHandSteering() {
		return handSteering;
	}

	public int getChangingGears() {
		return ChangingGears;
	}

	public int getSpeed() {
		return speed;
	}
	
	public void changingGears() {
		
		System.out.println(this.getHandSteering());
	}
	public void handSteering() {
		System.out.println(this.ChangingGears);
	}
	 public void speed() {
		 
		 System.out.println(this.speed);
	 }
	 public void typeOfVehicle() {
		 
		 System.out.println("unknown");
	 }
	
	

}



