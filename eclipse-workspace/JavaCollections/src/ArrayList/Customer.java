package ArrayList;

import java.util.ArrayList;

public class Customer {
	private String name;
	private ArrayList<Double> transactions;
	public Customer(String name, double initiaTransactions) {
		super();
		this.name = name;
		this.transactions = new ArrayList<Double>();
		addTransactions(initiaTransactions);
		
	}
	
	public void addTransactions(double amount ) {
		transactions.add(amount);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Double> getTransactions() {
		return transactions;
	}

	public void setTransactions(ArrayList<Double> transactions) {
		this.transactions = transactions;
	}

}
