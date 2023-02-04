package ClassesAndConstructors;

public class Case {
	
	private String powerSupply; 
	private String model;
	private String manufacturer;
	private Dimensions dimensions;
	public Case(String powerSupply, String model, String manufacturer, Dimensions dimensions) {
		super();
		this.powerSupply = powerSupply;
		this.model = model;
		this.manufacturer = manufacturer;
		this.dimensions = dimensions;
	}
	public String getPowerSupply() {
		return powerSupply;
	}
	public String getModel() {
		return model;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public Dimensions getDimensions() {
		return dimensions;
	}
	public void powerButton()
	{
		System.out.println("power button pressed");
	}
}
