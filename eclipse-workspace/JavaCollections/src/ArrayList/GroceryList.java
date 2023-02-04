package ArrayList;

import java.util.ArrayList;

public class GroceryList {
	
	private ArrayList<String> groceryList=  new ArrayList<String>();
	
	public void addGroceryItm(String item) {
		groceryList.add(item);
	}
	public ArrayList<String> getGroceryList(){
		return groceryList;
	}
	public void printGroceryList() {
		System.out.println("you have " +groceryList.size()+" items in your list");
		for (int i = 0; i < groceryList.size(); i++) {
			System.out.println((i+1) + ". " +groceryList.get(i));  //i+1 or i 
			//System.out.println((i) + " ." +groceryList.get(i));  //i+1 or i 
		}
	}
	
	public void modifyGroceryItem(String item,String itemr) {
		if (item!=null) {
			int itemNo=this.findGroceryItem(item);
			if (itemNo>=0) {
				System.out.println(" item found at" +itemNo);
				this.modifyGroceryItem(itemNo,itemr);
			}
			else {
				System.out.println(" check the input");
			}
			
		}
	}
	
	public void modifyRemoveGroceryItem(String item) {
		if (item!=null) {
			int itemNo=this.findGroceryItem(item);
			if (itemNo>=0) {
				this.removeGroceryItem(itemNo);
			}
		}
	}
	
	private void modifyGroceryItem(int position,String newItem) {
		if (position>=0 && newItem!=null) {
			System.out.println(" inside update");
			groceryList.set(position, newItem);
			System.out.println(" grocery item" +(position)+ " has been modified" ); //position+1 or Position
			//System.out.println(" grocery item" +(position)+ " has been modified" ); //position+1 or Position
			}
		
		else {
			System.out.println(" invalid input");
		}
	}
	
	private void removeGroceryItem(int position) {
		
//		String item= groceryList.get(position-1);
//		//groceryList.remove(item);
//		System.out.println(" remove item " +item+ " present at index " +groceryList.indexOf(item));
//		if (groceryList.remove(item)) {
//			System.out.println(" item removed " +item+ " present at index " +groceryList.indexOf(item));
//		}
//		String item=groceryList.get(position);
//		groceryList.remove(item);
	
		
		System.out.println(" the item has been removed" +groceryList.remove(position));
         
		
	}
	
	private int findGroceryItem(String searchItem) {
		return groceryList.indexOf(searchItem);
		}
	
	public void findGrocery(String searchItem) {
		if (groceryList.contains(searchItem)) {
			System.out.println(" item exists at index " +this.findGroceryItem(searchItem));
		}
		else {
			System.out.println(" item does not exists");
		}
	}

}
