package Interfaces;

public class Main {

	public static void main(String[] args) {
		ITelephone it= new DeskPhone(1235,false);
		it.answer();
		it.callPhone(1235);
		it.dial(123456);
		it.isRinging();
		it.powerOn();
		
	}
}
