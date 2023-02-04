package ClassesAndConstructors;

public class MainCar {

	public static void main(String[] args) {
		Cars car = new Cars("car", 2);
		car.accelerate("car");
		car.StartEngine("car");
		System.out.println(car.stop(" car"));

		Skoda skoda = new Skoda(" Skoda ", 6);

		System.out.println(skoda.stop("skoda "));
          System.out.println(skoda.inSkoda());
		
	}
}

class Cars {

	private boolean engine;
	private int wheels;
	private String name;
	private int cylinders;

	public Cars(String name, int cylinders) {
		super();
		this.name = name;
		this.cylinders = cylinders;
		this.engine = true;
		this.wheels = 4;
	}

	public boolean isEngine() {
		return engine;
	}

	public int getWheels() {
		return wheels;
	}

	public String getName() {
		return name;
	}

	public int getCylinders() {
		return cylinders;
	}

	public String StartEngine(String name) {

		return " Start =>" + name + " engine ";
	}

	public String accelerate(String name) {
		return "Car => " + name + "Accelerate";
	}

	public String stop(String name) {
		return " Break => Stop" + name;
	}

}

class Skoda extends Cars {

	public Skoda(String name, int cylinders) {
		super(name, cylinders);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String StartEngine(String skoda) {
		// TODO Auto-generated method stub
		return super.StartEngine("skoda");
	}

	@Override
	public String accelerate(String skoda) {
		// TODO Auto-generated method stub
		return super.accelerate("skoda");
	}

	@Override
	public String stop(String skoda) {
		// TODO Auto-generated method stub
		return super.stop(" skoda");
	}
	public String inSkoda()
	{
		System.out.println(" in skoda");
		return this.baseCar();
	}
	
    public String baseCar() {
    	System.out.println(getClass().getSimpleName());
		
    	return super.accelerate("");
	}
    
    

}