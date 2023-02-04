package ClassesAndConstructors;

public class Car extends Vehicle {

	public Car(String handSteering, int ChangingGears, int speed) {
		super(handSteering, ChangingGears, speed);

//		this.changingGears()=changingGears;
//		this.handSteering()=handSteering;
//		this.speed=speed;
	}

	@Override
	public void changingGears() {

		this.changingGears();
	}

	@Override
	public void handSteering() {

		this.handSteering();
	}

	@Override
	public void speed() {

	System.out.println();
	}
	@Override
	public void typeOfVehicle() {
		
		this.typeOfVehicle();
	}

}
