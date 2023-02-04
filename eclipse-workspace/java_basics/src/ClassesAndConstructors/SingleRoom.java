package ClassesAndConstructors;

public class SingleRoom {
	
	private FlowerPots flowerPots;
	private TV tv;
	private Windows windows;
	private Door doors;
	public SingleRoom(FlowerPots flowerPots, TV tv, Windows windows, Door doors) {
		super();
		this.flowerPots = flowerPots;
		this.tv = tv;
		this.windows = windows;
		this.doors = doors;
	}
	public FlowerPots getFlowerPots() {
		return flowerPots;
	}
	public TV getTv() {
		return tv;
	}
	public Windows getWindows() {
		return windows;
	}
	public Door getDoors() {
		return doors;
	}
	
	

}
