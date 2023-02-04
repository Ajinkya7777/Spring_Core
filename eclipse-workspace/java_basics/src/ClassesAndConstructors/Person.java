package ClassesAndConstructors;



public class Person {
	
	private String firstName = null; 
	
	private String lastName = null;
	private int age;

	public void setFirstName(String firstName) {
		 if(firstName.isEmpty())
		 {
			 this.firstName="";
		 }
		 else {
		this.firstName=firstName;
		 }
	}

	public void setLastName(String lastName) {
		 
		 if(firstName.isEmpty())
		 {
			 this.lastName="";
		 }
		 else {
		this.lastName=lastName;
		 }
		
	}

	public void setAge(int age) {
		if((age>0) && (age<100))
		{
		 this.age=age;
		}
		else
			{
			this.age=0;
			}
	}
	
public int getAge() {
		
		return this.age;
}
		
	
	public String getFirstName() {
		 
		return firstName;
	}

	public String getLastName() {
		 
		return lastName;
	}

	public boolean isTeen() {
		 if((this.age>12) && (this.age<20))
		 {
		return true;
		 }
		 return false;
	}

	public String getFullName() {
		 
		if((firstName.isEmpty()) && (lastName.isEmpty()))
		{
			return "";
		}
		else if(lastName.isEmpty()) {
			return firstName;
		}
		else if(firstName.isEmpty()){
			return lastName;
		}
		String fullname= firstName +" "+lastName;
		return fullname;
	}

	

}
