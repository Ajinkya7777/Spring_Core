package ArrayList;

import java.util.ArrayList;

public class Branch {

	private String name;
	private ArrayList<Customer> customers;
	public Branch(String name) {
		super();
		this.name = name;
		this.customers = new ArrayList<Customer>();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Customer> getCustomers() {
		return customers;
	}
	public void setCustomers(ArrayList<Customer> customers) {
		this.customers = customers;
	}
	
	public boolean addCustomer(String cName,double iniitialAmount) {
		Customer exist= findCustomer(cName, iniitialAmount);
		if (exist==null) {
			this.customers.add(new Customer(cName, iniitialAmount));
			return true;
		}
		return false ;
	}
	
	public boolean addTransaction(String name,double addAmount) {
		 Customer existingCustomer= findCustomer(name, addAmount);
		if (existingCustomer!=null) {
			
			existingCustomer.addTransactions(addAmount);
			return true;
		}
		return false;
	}
	private Customer findCustomer(String name2, double addAmount) {
		 for (int i = 0; i < customers.size(); i++) {
	      if (name2== customers.get(i).getName()) {
			
	    	  Customer co= customers.get(i);
	    	  return co;
		}		
		}
		return null;
	}
	
}
