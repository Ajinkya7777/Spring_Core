package ClassesAndConstructors;

public class VipCustomers {
	private String name;
	private long creditLimit;
	private String email;
	
	public VipCustomers() {
		
		this("Ajinkya",25000,"ajinkya@gmail.com");
	}

	public VipCustomers(long creditLimit,String email)
	{
		this("Ajinkya",creditLimit,email);
	}
	public VipCustomers(String name, long creditLimit, String email) {
		
		this.name=name;
		this.creditLimit=creditLimit;
		this.email=email;
		
	}

	
	public void getName()
	{
		System.out.println(name);
	}
	public void getCreditLimit()
	{
		System.out.println(creditLimit);
	}
	public void getEmail()
	{
		System.out.println(email);
	}
	
}
