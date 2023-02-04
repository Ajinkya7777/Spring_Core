package ArrayList;

import java.util.ArrayList;

public class Bank {

	private String name;
	private ArrayList<Branch> branches;
	public Bank(String name) {
		super();
		this.name = name;
		this.branches =new ArrayList<Branch>();
	}
	
	public boolean addBranch(String name) {
		if (findBranch(name)== null) {
			this.branches.add(new Branch(name));
			return true;
					
		}
		return false;
	}
	
	public boolean addCustomer(String bName,String name,double amount) {
		Branch branch = findBranch(bName);
		if (branch!=null) {
			return branch.addCustomer(name, amount);
			}
		return false;
	}
	private Branch findBranch(String bName) {
		for (int i = 0; i < branches.size(); i++) {
			
			if (bName==branches.get(i).getName()) {
				Branch branch= branches.get(i);
				return branch;
			}	
			
		}
		return null;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Branch> getBranches() {
		return branches;
	}

	public void setBranches(ArrayList<Branch> branches) {
		this.branches = branches;
	}

	public boolean addTransaction(String bName,String name,double amount) {
		Branch branch = findBranch(bName);
		if (branch!=null) {
			return branch.addTransaction(name, amount);
		}
		return false;
	}
	
	public boolean listCustomers(String bName,boolean showTransactions) {
		Branch branch = findBranch(bName);
		if (branch!=null) {
			System.out.println(" customers list for Branch :" +branch.getName());
			ArrayList<Customer> customerList= branch.getCustomers();
			for(Customer co:customerList)
			{
				System.out.println(" customer name :" +co.getName());
				if (showTransactions) {
					System.out.println(" transactions");
					ArrayList<Double> transactionList=co.getTransactions();
//					for(Customer co1:transactionList) {
//						System.out.println(" transactions "+co1.getName() );
//						
//					}
					for (int i = 0; i < transactionList.size(); i++) {
						System.out.println(" transactions "+transactionList.get(i) );
					}
				}
				
			}
			return true;
			
		}
		else {
			return false;
		}
	}
	
	
}


