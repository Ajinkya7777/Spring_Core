package ClassesAndConstructors;

public class PC {
	private Case cases;
	private Motherboard motherboard;
	private Monitor monitor;
	public PC(Case cases, Motherboard motherboard, Monitor monitor) {
		super();
		this.cases = cases;
		this.motherboard = motherboard;
		this.monitor = monitor;
	}
	
	public void powerUp() {
		
		cases.powerButton();
		drawLogo();
	}
	private void drawLogo() {
		monitor.drawPixelAt(2000,2000, "white");
	}
	
	
}
