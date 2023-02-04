package ClassesAndConstructors;


public class Bank {
	private int accountNo=0;
	private double balance=0.0;
	private String name=null;
	private String email=null;
	private String mobileNo=null;
    private double deposite=0.0;
	private double withdraw;
	public Bank() {
		this(1,50.0,"Ajinkya", "Ajinkya@gmail.com","7972927427",50.0,99.0);
		System.out.println("Empty Constructor Called");
	}
	public Bank(int accountNo, double balance, String name, String email,String mobileNo,double deposite,double withdraw)
	{
		System.out.println(this.accountNo=accountNo);
		System.out.println(this.balance=balance);
	    System.out.println(this.name=name);
		System.out.println(this.email=email);
	    System.out.println(this.mobileNo=mobileNo);
		System.out.println(this.deposite=deposite);
		System.out.println(this.withdraw=withdraw);
	}
	
	
	public void setAccountNo(int accountNo) {
		 
		this.accountNo=accountNo;
	}

	public void setBalance(double balance) {
		 
		if(balance>0.0)
		{
			this.balance=balance;
			
		}
		else
		{
			this.balance=0.0;
		}
	}

	public void setName(String name) {
		
		if (!(name.isEmpty())) {
			this.name=name;
			
		} else {
			this.name="";
		}
		 
	}

	public void setEmail(String email) {

		if (!(email.isEmpty())) {
			this.email=email;
			
		} else {
			this.email="";
		}
		 
		
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo=mobileNo;
		 
		
	}

	public double deposit(double deposit) {
		this.deposite=deposit;
		if(deposite>0)
		{
		 balance=deposit+balance;
		 return balance;
		}
		else {
			return this.balance;
		}
		
	}

	public double withdrawl(double withdraw) {
		 this.withdraw=withdraw;
		if (withdraw<balance) {
			balance=balance-withdraw;
			return balance;
			
		} else {
              System.out.println("insufficiant balance for" +this.withdraw+ " Remaining balance :" +balance);
              return this.balance;
		}
	}

	public int getAccountNo() {
		 
		return this.accountNo;
	}

	public double getBalance() {
		 
		return this.balance;
	}

	public String getName() {
		 
		return this.name;
	}

	public String getEmail() {
		 
		return this.email;
	}

	public String getMobileNo() {
		 
		return this.mobileNo;
	}

}
