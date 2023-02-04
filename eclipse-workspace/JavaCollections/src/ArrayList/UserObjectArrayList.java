package ArrayList;
//How to add user class objects to arraylist
import java.util.ArrayList;


public class UserObjectArrayList {

	public static void main(String[] args) {
		ArrayList<UserObject> userList= new ArrayList<UserObject>();
		
		UserObject user1= new UserObject("Latur", "Ajinkya");
		UserObject user2= new UserObject("Latur", "Shubham");
		UserObject user3= new UserObject("Jaipur", "Swati");
		UserObject user4= new UserObject("Manchester ", "Ronaldo");
		
		userList.add(user1);
		userList.add(user2);
		userList.add(user3);
		userList.add(user4);
		System.out.println(userList); // need to override the ToString()	in UserObject class
		
		System.out.println(" ==============another way to get details by not overriding toString methods\n");
		System.out.println(userList.get(3).getUser()+" belongs to" + userList.get(3)+" United"); //need not use to ToString method
		
		System.out.println(" ==============another way to get details by not overriding toString methods\n");
		for (int i=0;i<userList.size();i++) {
			System.out.println(userList.get(i).getUser()+" belongs to " +userList.get(i).getCity());
		}
		System.out.println("================using forEach loop need to override toString method=================\n");
		for(UserObject user: userList)	
		{
			//System.out.println(user.toString());
			System.out.println(user);
			
		}
		System.out.println(" ==============another way to get details by not overriding toString methods\n");
	  for (UserObject userObject : userList) {
		  System.out.println("details	" + userObject.getUser() +" " + userObject.getCity());
	}

	}
	
}
class UserObject
{
	private String city ;
	private String user;
	public UserObject(String city,String user) {
		this.city=city;
		this.user=user;
	}
//	@Override
//	public String toString() {
//		//return "UserObject [city=" + city + ", user=" + user + "]";
//		return " userName= " +user+" cityName = " +city;
//	}
	
	public String getCity()
	{
		return city;
	}
	public String getUser() {
		return user;
	}
	
}
