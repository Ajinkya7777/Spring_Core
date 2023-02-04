package ClassesAndConstructors;

public class HealthyBurger extends BillsHamburger {
	private String healthyExtra1Name;
	private double healthyExtra1Price;
	
	private String healthyExtra2Name;
	private double healthyExtra2Price;
	
	public HealthyBurger( double price, String meat) {
		super("healthy", "brown rye", price, meat);
		
	}
	public void additionhealthy1(String name,double price) {
		this.healthyExtra1Name= name;
		this.healthyExtra1Price=price;
	}
	
	public void additionhealthy2(String name,double price) {
		this.healthyExtra2Name= name;
		this.healthyExtra2Price=price;
	}
	
	@Override
	public double iteamizeHamburger() {
	 double healthyBurgerPrice =super.iteamizeHamburger();
	 
	 if (healthyExtra1Name!=null) {
		healthyBurgerPrice= healthyBurgerPrice+this.healthyExtra1Price;
		System.out.println(" added " +this.healthyExtra1Name + " for additional price " +healthyExtra1Price);
	}
	 if (healthyExtra2Name!=null) {
		 healthyBurgerPrice= healthyBurgerPrice+this.healthyExtra2Price;
		 System.out.println(" added " +this.healthyExtra2Name + " for additional price " +healthyExtra2Price);
	 }
	return healthyBurgerPrice;
	}

}
