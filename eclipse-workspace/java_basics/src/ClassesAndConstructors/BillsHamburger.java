package ClassesAndConstructors;


public class BillsHamburger {

	private String breadType;
	private String meat;
	private double price ;
	private String name; 
	
	private String adddition1Name;
	private double additon1Price;
	
	private String adddition2Name;
	private double additon2Price;
	
	private String adddition3Name;
	private double additon3Price;

	private String adddition4Name;
	private double additon4Price;
	
	public BillsHamburger(String name,String breadType,double price,String meat) {
		
		this.breadType=breadType;
		this.meat=meat;
		this.price=price;
		this.name=name;
	}
	
	public void addHamburgerAddition1(String name, double price)
	{
		this.adddition1Name=name;
		this.additon1Price=price;
	}
	public void addHamburgerAddition2(String name, double price)
	{
		this.adddition2Name=name;
		this.additon2Price=price;
	}
	public void addHamburgerAddition3(String name, double price)
	{
		this.adddition3Name=name;
		this.additon3Price=price;
	}
	public void addHamburgerAddition4(String name, double price)
	{
		this.adddition4Name=name;
		this.additon4Price=price;
	}
	
	public double iteamizeHamburger() {
		double hamburgerPrice=this.price;
		System.out.println(this.name + " hamburger on a " + this.breadType + " roll Price is " +this.price);
		
		if(this.adddition1Name!=null)
		{
			hamburgerPrice=this.additon1Price+hamburgerPrice;
			System.out.println(" Added " +this.adddition1Name + " for an additonal price of " +this.additon1Price);
		}
		if(this.adddition2Name!=null)
		{
			hamburgerPrice=this.additon2Price+hamburgerPrice;
			System.out.println(" Added " +this.adddition2Name + " for an additonal price of " +this.additon2Price);
		}
		if(this.adddition3Name!=null)
		{
			hamburgerPrice=this.additon3Price+hamburgerPrice;
			System.out.println(" Added " +this.adddition3Name + " for an additonal price of " +this.additon3Price);
		}
		if(this.adddition4Name!=null)
		{
			hamburgerPrice=this.additon4Price+hamburgerPrice;
			System.out.println(" Added " +this.adddition4Name + " for an additonal price of " +this.additon4Price);
		}
		return hamburgerPrice;
	}
	
	
}
