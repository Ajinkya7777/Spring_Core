package ClassesAndConstructors;

public class DeluxBurger extends BillsHamburger {

	public DeluxBurger() {
		super("delux", "white", 15, "Sausage & bacon");
		super.addHamburgerAddition1("chips", 2);
		super.addHamburgerAddition2(" drinks", 5);

	}

	@Override
	public void addHamburgerAddition1(String name, double price) {

		System.out.println("can't add");
	}

	@Override
	public void addHamburgerAddition2(String name, double price) {
		System.out.println("can't add");

	}

	@Override
	public void addHamburgerAddition3(String name, double price) {
		System.out.println("can't add");
	}

	@Override
	public void addHamburgerAddition4(String name, double price) {
		System.out.println("can't add extra items ");
	}

}
