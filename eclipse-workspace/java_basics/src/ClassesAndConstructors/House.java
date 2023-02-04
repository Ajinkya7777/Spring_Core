package ClassesAndConstructors;

public class House {
	private TV tv;
	private FlowerPots flowerPots;
	private SingleRoom singleRoom;
	private Windows windows;
	private Door door;
	public House(TV tv, FlowerPots flowerPots, SingleRoom singleRoom, Windows windows, Door door) {
		super();
		this.tv = tv;
		this.flowerPots = flowerPots;
		this.singleRoom = singleRoom;
		this.windows = windows;
		this.door = door;
	}
	
	public void myHouseFlowerPots()
	{
		flowerPots.getFlowers("Roses");
		myHouse();
	}
	
	public void myHouse()
	{
		System.out.println(" my house is having  beautiful flower pots ");
	}
	public TV getTv() {
		return tv;
	}
	public FlowerPots getFlowerPots() {
		return flowerPots;
	}
	public SingleRoom getSingleRoom() {
		return singleRoom;
	}
	public Windows getWindows() {
		return windows;
	}
	public Door getDoor() {
		return door;
	}
	
	
	
	

}
